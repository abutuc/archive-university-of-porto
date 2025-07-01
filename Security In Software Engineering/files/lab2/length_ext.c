/* length_ext.c */
#include <stdio.h>
#include <arpa/inet.h>
#include <openssl/sha.h>

int main(int argc, const char *argv[]){
    int i;
    unsigned char buffer[SHA256_DIGEST_LENGTH];
    SHA256_CTX c;
    SHA256_Init(&c);

    for(i=0; i<64; i++)
        SHA256_Update(&c, "*", 1);

    // MAC of the original message M (padded)
    c.h[0] = htole32(0x521d24e7);
    c.h[1] = htole32(0x2ac1e546);
    c.h[2] = htole32(0xb8606fef);
    c.h[3] = htole32(0xe16cfa12);
    c.h[4] = htole32(0xe71acafb);
    c.h[5] = htole32(0x7adaed26);
    c.h[6] = htole32(0x97b3a3d7);
    c.h[7] = htole32(0x60cf9c2f);
    
    // Append additional message
    SHA256_Update(&c, "&download=secret.txt", 20);
    SHA256_Final(buffer, &c);
    
    for(i = 0; i < 32; i++) {
        printf("%02x", buffer[i]);
    }
    
    printf("\n");
    return 0;
}
interface SESFile {
  id?: string;
  name: string;
  storageName: string;
  mimeType: string;
  size: number;
  directoryId: string;
  ownerId: string;
  permission: string;
}


interface File {
  id?: string;
  name: string;
  storageName: string;
  mimeType: string;
  size: number;
  directoryId: string;
  ownerId: string;
}

interface FileWithPermission {
  id?: string;
  name: string;
  storageName: string;
  mimeType: string;
  size: number;
  directoryId: string;
  ownerId: string;
  permission: string;
}

interface Directory {
  id: string;
  name: string;
  path: string;
  parentId: string;
  ownerId: string;
}

interface SESUser {
  id: string;
  name: string;
  email: string;
  permissions: ("VIEW" | "EDIT" | "DELETE")[];
}


export type { File, Directory, FileWithPermission, SESFile, SESUser };
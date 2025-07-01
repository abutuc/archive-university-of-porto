#!/usr/bin/env python

import random
import sys

def testMe(x):
    if (x == 10):
        return "Ten" # <<< TARGET >>>
    else:
        return "Other number"

# ------------------------------------------------------------------------------

num_generations = 0
str = ""
while str != "Ten":
    #str = testMe(random.randint(-sys.maxsize, sys.maxsize))
    str = testMe(random.randint(-1000, +1000))
    num_generations += 1

print("Number of generations to test the true branch: %d" % (num_generations))

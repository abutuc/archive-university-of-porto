#!/usr/bin/env python

import random
import sys

from Instrumentation import *

# def testMe(x, y):
#     if x <= y:
#         if x > 0:
#             if y == 17:
#                 return True # <<< TARGET >>>
#             else:
#                 return False
#         else:
#             return False
#     else:
#         return False

def testMe(x, y):
    if BranchPredicate(1, '<=', x, y, 2):
        if BranchPredicate(2, '>', x, 0, 1):
            if BranchPredicate(3, '==', y, 17, 0):
                return True # <<< TARGET >>>
            else:
                return False
        else:
            return False
    else:
        return False

def get_fitness(x, y):
    # Reset data
    reset()
    # Run code under test
    testMe(x, y)
    # Compute fitness
    print(distanceMapTrue) # FIXME remove me
    fitness = 0
    for num in distanceMapTrue.keys():
        fitness += distanceMapTrue[num]

    return fitness

MIN = -1000
MAX = +1000

# x, y = random.randint(MIN, MAX), random.randint(MIN, MAX)
x, y = 10, 1
fitness = get_fitness(x, y)
print(fitness)
x, y = -9, 1
fitness = get_fitness(x, y)
print(fitness)

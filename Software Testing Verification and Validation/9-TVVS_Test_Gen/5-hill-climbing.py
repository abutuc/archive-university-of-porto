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

MIN = -1000000
MAX = +1000000

def neighbours(x, y):
    return [(x+dx, y+dy) for dx in [-1,0,1] for dy in [-1,0,1] if (dx != 0 or dy != 0) and ((MIN <= x+dx <= MAX) and (MIN <= y+dy <= MAX))]

x, y = random.randint(MIN, MAX), random.randint(MIN, MAX)
fitness = get_fitness(x, y)

while fitness > 0:
    changed = False
    for (nextx, nexty) in neighbours(x,y):
        new_fitness = get_fitness(nextx, nexty)
        if new_fitness < fitness:
            x, y = nextx, nexty
            fitness = new_fitness
            changed = True
            print("New value: %d, %d at fitness %.4f" %(x, y, fitness))
            break # Random Ascent strategy
    if not changed:
        if fitness > 0:
            x, y = random.randint(MIN, MAX), random.randint(MIN, MAX)
            fitness = get_fitness(x, y)
            print("Random restart at %d, %d" % (x, y))

print("Optimum at %d, %d, fitness %.4f" % (x, y, fitness))

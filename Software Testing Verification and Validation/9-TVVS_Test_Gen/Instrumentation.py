#!/usr/bin/python

distanceMapTrue  = {}

def normalise(x):
    return x / (x + 1.0)

def reset():
    global distanceMapTrue
    distanceMapTrue.clear()

def BranchPredicate(num, op, lhs, rhs, level=0):
    global distanceMapTrue

    distanceTrue  = 0.0

    if op == '==':
        if lhs == rhs:
            pass
        else:
            distanceTrue = abs(lhs - rhs)

    elif op == '!=':
        if lhs != rhs:
            pass
        else:
            distanceTrue = 1.0

    elif op == '<':
        if lhs < rhs:
            pass
        else:
            distanceTrue = lhs - rhs + 1

    elif op == '<=':
        if lhs <= rhs:
            pass
        else:
            distanceTrue = lhs - rhs

    elif op == '>':
        if lhs > rhs:
            pass
        else:
            distanceTrue = rhs - lhs

    elif op == '>=':
        if lhs >= rhs:
            pass
        else:
            distanceTrue = rhs - lhs

    if num in distanceMapTrue.keys():
        distanceMapTrue[num]  = min(distanceMapTrue[num], (level if distanceTrue > 0 else 0) + normalise(distanceTrue))
    else:
        distanceMapTrue[num]  = (level if distanceTrue > 0 else 0) + normalise(distanceTrue)

    return True if distanceTrue == 0 else False

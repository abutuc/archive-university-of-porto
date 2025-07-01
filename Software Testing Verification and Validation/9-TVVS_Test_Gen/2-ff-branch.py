#!/usr/bin/env python

import random
import sys

cov = [0, 0, 0, 0, 0, 0]

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
    if x <= y:
        cov[0] = 1
        if x > 0:
            cov[1] = 1
            if y == 17:
                cov[2] = 1
                return True # <<< TARGET >>>
            else:
                cov[3] = 1
                return False
        else:
            cov[4] = 1
            return False
    else:
        cov[5] = 1
        return False

testMe(3, 5)
print(cov)
print("Coverage: %.2f" % (sum(cov) / len(cov)))

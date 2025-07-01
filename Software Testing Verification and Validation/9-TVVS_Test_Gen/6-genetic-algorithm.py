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

def get_fitness(individual):
    # Reset data
    reset()
    # Run code under test
    testMe(*individual)
    # Compute fitness
    print(distanceMapTrue) # FIXME remove me
    fitness = 0
    for num in distanceMapTrue.keys():
        fitness += distanceMapTrue[num]

    return fitness

def select_tournament(population, tournament_size):
    selected = random.choice(population)
    champion_fitness = get_fitness(selected)
    competition = random.sample(population, tournament_size)
    for competitor in competition:
        challenger_fitness = get_fitness(competitor)
        if challenger_fitness < champion_fitness:
            selected = competitor
            champion_fitness = challenger_fitness

    # Return a copy of the selected individual
    return selected[:]

def crossover_onepoint(parent1, parent2):
    pos = random.randint(0, len(parent1))

    offspring1 = parent1[:pos] + parent2[pos:]
    offspring2 = parent2[:pos] + parent1[pos:]

    return (offspring1, offspring2)

def mutate_intlist(chromosome):
    P = 1.0 / len(chromosome)
    for pos in range(len(chromosome)):
        if random.random() < P:
            chromosome[pos] = int(random.gauss(chromosome[pos], 100))

def initialise_population(population_size, chromosome_length=2):
    population = []
    for _ in range(population_size):
        individual = [random.randint(MIN, MAX) for _ in range(chromosome_length)]
        population.append(individual)

    return population

MIN = -1000000
MAX = +1000000

generation = 0
best_fitness = sys.maxsize
population = initialise_population(100)
population.sort(key=lambda individual: get_fitness(individual))

while best_fitness > 0 and generation < 10000:

    best_fitness = get_fitness(population[0])
    print("Best fitness at generation %d: %.10f" % (generation, best_fitness))
    generation += 1

    new_population = population[:2]

    while len(new_population) < len(population):
        offspring1 = select_tournament(population, 2)
        offspring2 = select_tournament(population, 2)

        if random.random() < 0.70:
            offspring1, offspring2 = crossover_onepoint(offspring1, offspring2)

        if random.random() < 0.10:
            mutate_intlist(offspring1)
            mutate_intlist(offspring2)
        new_population += [offspring1, offspring2]

    # Once full, the new population replaces the old one
    population = new_population

    # Sort population by fitness
    population.sort(key=lambda individual: get_fitness(individual))

print("Best individual: %s, fitness %.10f found in %d generations" % (population[0], get_fitness(population[0]), generation))

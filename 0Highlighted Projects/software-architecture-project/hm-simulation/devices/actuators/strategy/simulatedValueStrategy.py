from devices.actuators.strategy.dataGenerationStrategy import DataGenerationStrategy
import random

class SimulatedValueStrategy(DataGenerationStrategy):
    def generate(self, current_value: float) -> float:
        # adds a variation to the current value for simulation purposes
        random_variation = random.uniform(-1 * current_value * 0.5, current_value * 0.5)
        current_value += random_variation
        return current_value
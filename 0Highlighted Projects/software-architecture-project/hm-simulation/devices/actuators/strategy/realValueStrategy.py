from devices.actuators.strategy.dataGenerationStrategy import DataGenerationStrategy

class RealValueStrategy(DataGenerationStrategy):
    def generate(self, current_value: float) -> float:
        return current_value
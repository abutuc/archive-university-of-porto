from abc import ABC, abstractmethod

class DataGenerationStrategy(ABC):
    @abstractmethod
    def generate(self, current_value: float) -> float:
        pass
class Home:
    def __init__(self):
        # self.temperature = 20 # average temperature in celsius
        self.temperature = 15 # simulate a cold home
        self.light = 100 # average light in lux

    # Getters   
    def get_temperature(self):
        return self.temperature
    
    def get_light(self):
        return self.light
    
    # Setters
    def set_temperature(self, temperature):
        self.temperature = temperature

    def set_light(self, light):
        self.light = light

    def __repr__(self):
        return f"Temperature: {self.temperature}°C, Light: {self.light} lux"

    def __str__(self):
        return f"Temperature: {self.temperature}°C, Light: {self.light} lux"
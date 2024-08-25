# Class definition. Uppercase first letter

class Car:
    # Constructor. Gets called automatically
    def __init__(self, brand, speed_limit):
        # Instance variables
        self.brand = brand
        self.speed_limit = speed_limit

    # Simple method that displays object info
    def display_info(self):
        print(f"Brand: {self.brand}, Speed Limit: {self.speed_limit} km/h")

car1 = Car("Mazda", 200)
car2 = Car("Honda", 200)

# Using the display_info method to show details of each car
car1.display_info()
car2.display_info()

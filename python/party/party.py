class Party:

    def __init__(self, first_name, second_name, address):
        self.first_name = first_name
        self.second_name = second_name
        self.address = address

    def __str__(self):
        return "{firstname:" + self.first_name + "," + "secondname:" + self.second_name \
               + ",address:" + self.address + "}"

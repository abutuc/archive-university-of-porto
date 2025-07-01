class ZigbeeHub:
    def __init__(self, hub_id):
        self.hub_id = hub_id
        self.activated = False

    def activate(self):
        self.activated = True

    def deactivate(self):
        self.activated = False
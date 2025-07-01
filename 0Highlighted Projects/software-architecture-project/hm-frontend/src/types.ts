type RuleRequest = Map<string, string>;

enum Operation {
  LT= "<",
  LTE = "<=",
  EQ = "=",
  GE = ">=",
  GT = ">",
}

abstract class Device {
  id: string;
  protocol: Protocol;
  on: boolean;
  name: string;

  protected constructor(protocol: Protocol) {
    this.id = "";
    this.protocol = protocol;
    this.on = false;
    this.name = "";
  }
}

class Hub extends Device {
  constructor(protocol: Protocol) {
    super(protocol);
  }
}

class Sensor extends Device {
  measurementValue: number;

  constructor(protocol: Protocol) {
    super(protocol);
    this.measurementValue = 0;
  }
}

abstract class Actuator extends Device {
  command: string;
  isActionOn: boolean;

  constructor(protocol: Protocol) {
    super(protocol);
    this.command = "";
    this.isActionOn = false;
  }
}

abstract class HybridDevice extends Device {
  constructor(protocol: Protocol) {
    super(protocol);
  }
}

interface Protocol {
  type: string;
}

export type {RuleRequest, Protocol}; // Export the interfaces and enum for use in other components

export { Operation, Sensor, Hub, Actuator, Device, HybridDevice }; // Export the classes for use in other components

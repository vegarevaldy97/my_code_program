package com.anabatic.parkinglot;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;
public class CommandInput {
    public Map<String, Method> commandsMap;

    public CommandInput() {
        commandsMap = new HashMap<String, Method>();
        try {
            populateCommandsHashMap();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private void populateCommandsHashMap() throws NoSuchMethodException {
        commandsMap.put("create_parking_lot", ParkingLot.class.getMethod("createParkingLot", String.class));
        commandsMap.put("park", ParkingLot.class.getMethod("park", String.class, String.class));
        commandsMap.put("leave", ParkingLot.class.getMethod("leave", String.class, String.class));
        commandsMap.put("status", ParkingLot.class.getMethod("status"));
    }
}

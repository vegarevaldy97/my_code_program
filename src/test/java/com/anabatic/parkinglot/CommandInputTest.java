package com.anabatic.parkinglot;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandInputTest {
    CommandInput commandInput = new CommandInput();
    @Test
    public void checkCommandInList() throws Exception {
        assertFalse(commandInput.commandsMap.isEmpty());
        assertTrue(commandInput.commandsMap.containsKey("create_parking_lot"));
        assertFalse(commandInput.commandsMap.containsKey("mytestcommand"));
    }
}
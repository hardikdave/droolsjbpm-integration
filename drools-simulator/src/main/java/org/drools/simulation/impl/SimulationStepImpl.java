/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.simulation.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.drools.command.Command;
import org.drools.simulation.SimulationPath;
import org.drools.simulation.SimulationStep;

public class SimulationStepImpl
        implements SimulationStep {

    private SimulationPath path;
    private Collection<Command> commands;
    private long                distance;

    public SimulationStepImpl(SimulationPath path,
            Collection<Command> commands,
            long distance) {
        this.path = path;
        this.commands = commands;
        this.distance = distance;
    }
    
    public SimulationStepImpl(SimulationPath path,
            Command command,
            long distance) {
        this.path = path;
        commands = new ArrayList<Command>();
        ((List<Command>)this.commands).add( command );
        this.distance = distance;
    }

    public Collection<Command> getCommands() {
        return commands;
    }

    public long getTemporalDistance() {
        return distance;
    }

    public SimulationPath getPath() {
        return this.path;
    }

    @Override
    public String toString() {
        return "SimulationStepImpl [distance=" + distance + ", path=" + path + ", commands=" + commands + "]";
    }

}

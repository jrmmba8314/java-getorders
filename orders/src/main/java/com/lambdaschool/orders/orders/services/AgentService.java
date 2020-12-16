package com.lambdaschool.orders.orders.services;

import com.lambdaschool.orders.orders.models.Agent;

import java.util.List;

public interface AgentService {
    Agent save(Agent agent);

    Agent findAgentById(long id);
}

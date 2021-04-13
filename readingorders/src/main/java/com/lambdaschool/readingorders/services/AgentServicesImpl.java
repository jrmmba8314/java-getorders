package com.lambdaschool.readingorders.services;

import com.lambdaschool.readingorders.models.Agent;
import com.lambdaschool.readingorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AgentServicesImpl implements AgentServices {

  @Autowired
  private AgentsRepository agentRepos;

  @Transactional
  @Override
  public Agent save(Agent agent) {
    return agentRepos.save(agent);
  }

}

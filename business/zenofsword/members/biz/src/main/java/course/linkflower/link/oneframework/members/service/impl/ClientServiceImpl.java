package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.members.dao.ClientMapper;
import course.linkflower.link.oneframework.members.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientMapper clientMapper;
}

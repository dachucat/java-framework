package course.linkflower.link.oneframework.house.vo.client;

import lombok.Data;

@Data
public class ClientInfoVo {
    private String id;
    private String name;
    public ClientInfoVo loadFrom(Client client){
        if (client != null){
            id = String.valueOf(client.getId());
            name=client.getName();
        }
            return  this;
    }

}

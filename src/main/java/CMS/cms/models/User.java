package CMS.cms.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.management.relation.Role;

@Data
@Document(collection = "user")
public class User {
    @Id
    String id;
    String identity;
    String name;
    Role role;
}

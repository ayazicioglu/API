package pojos.team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PojoJsonPlaceTeam {

    private String title;
    private String body;
    private int userId;
    private int id;
}

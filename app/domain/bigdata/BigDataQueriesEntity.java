package domain.bigdata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BigDataQueriesEntity.
 * @author SandQ
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BigDataQueriesEntity {
    
    private Long id;
    private String queryKey;
    private String query;

}

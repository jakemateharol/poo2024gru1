
package pe.edu.upeu.syscenterlife.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

        

@Builder        
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    String dniruc;
    String nombre;
    String documento;
    
}

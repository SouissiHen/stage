package Entity;

import Entity.Etudiant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T14:39:10")
@StaticMetamodel(Rapports.class)
public class Rapports_ { 

    public static volatile SingularAttribute<Rapports, Etudiant> numInscript;
    public static volatile SingularAttribute<Rapports, byte[]> rapport;
    public static volatile SingularAttribute<Rapports, Boolean> accepter;
    public static volatile SingularAttribute<Rapports, Integer> idRapport;

}
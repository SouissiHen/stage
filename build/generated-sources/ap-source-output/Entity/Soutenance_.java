package Entity;

import Entity.Jury;
import Entity.SessionSoutenance;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T14:39:10")
@StaticMetamodel(Soutenance.class)
public class Soutenance_ { 

    public static volatile SingularAttribute<Soutenance, Float> note;
    public static volatile SingularAttribute<Soutenance, SessionSoutenance> idsessionS;
    public static volatile SingularAttribute<Soutenance, Integer> numSoutenance;
    public static volatile SingularAttribute<Soutenance, Date> heureSoutenance;
    public static volatile SingularAttribute<Soutenance, Date> dateSoutenance;
    public static volatile SingularAttribute<Soutenance, Jury> numJury;

}
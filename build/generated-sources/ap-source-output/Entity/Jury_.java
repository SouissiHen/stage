package Entity;

import Entity.SessionSoutenance;
import Entity.Soutenance;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T14:39:10")
@StaticMetamodel(Jury.class)
public class Jury_ { 

    public static volatile SingularAttribute<Jury, String> codeendM3;
    public static volatile SingularAttribute<Jury, SessionSoutenance> idsessionS;
    public static volatile SingularAttribute<Jury, String> codeendM1;
    public static volatile SingularAttribute<Jury, String> codeendM2;
    public static volatile ListAttribute<Jury, Soutenance> soutenanceList;
    public static volatile SingularAttribute<Jury, Integer> numJury;

}
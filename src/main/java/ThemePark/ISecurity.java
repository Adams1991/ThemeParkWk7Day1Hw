package ThemePark;

import People.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);
}
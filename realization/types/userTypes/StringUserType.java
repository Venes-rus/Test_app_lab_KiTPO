package realization.types.userTypes;

import realization.types.StringType;
import realization.types.comporators.Comporator;
import realization.types.comporators.StringComporator;

import java.io.IOException;
import java.io.InputStreamReader;

public class StringUserType implements UserType {
    @Override
    public String typeName() {
        return "String";
    }

    @Override
    public Object create() {
        return new StringType("default");
    }

    @Override
    public Object clone(Object object) {
        return new StringType(((StringType) object).getStringValue());
    }

    @Override
    public Object readValue(InputStreamReader in) throws IOException {
        return in.read();
    }

    @Override
    public Object parseValue(String ss) {
        return new StringType(ss);
    }

    @Override
    public Comporator getTypeComparator() {
        return new StringComporator();
    }

    @Override
    public String toString(Object object) {
        return object.toString();
    }
}

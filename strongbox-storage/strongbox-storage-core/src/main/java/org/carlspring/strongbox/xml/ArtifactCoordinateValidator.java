package org.carlspring.strongbox.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;
import java.io.Serializable;

/**
 * @author Przemyslaw Fusik
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ArtifactCoordinateValidator
        implements Serializable
{

    @XmlValue
    private String value;

    public ArtifactCoordinateValidator()
    {
    }

    public ArtifactCoordinateValidator(final String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(final String value)
    {
        this.value = value;
    }
}

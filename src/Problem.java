import java.io.IOException;

public interface Problem 
{
	Object result() throws IOException;
	void setValue(Object input);
}

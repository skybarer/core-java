
public final class java.lang.System {

  public static final java.io.InputStream in;
  public static final java.io.PrintStream out;
  public static final java.io.PrintStream err;

  public static void setIn(java.io.InputStream);
  public static void setOut(java.io.PrintStream);
  public static void setErr(java.io.PrintStream);

  public static java.io.Console console();
  public static java.nio.channels.Channel inheritedChannel() throws java.io.IOException;
  public static void setSecurityManager(java.lang.SecurityManager);
  public static java.lang.SecurityManager getSecurityManager();
  public static native long currentTimeMillis();
  public static native long nanoTime();
  public static native void arraycopy(java.lang.Object, int, java.lang.Object, int, int);
  public static native int identityHashCode(java.lang.Object);
  public static java.util.Properties getProperties();
  public static java.lang.String lineSeparator();
  public static void setProperties(java.util.Properties);
  public static java.lang.String getProperty(java.lang.String);
  public static java.lang.String getProperty(java.lang.String, java.lang.String);
  public static java.lang.String setProperty(java.lang.String, java.lang.String);
  public static java.lang.String clearProperty(java.lang.String);
  public static java.lang.String getenv(java.lang.String);
  public static java.util.Map<java.lang.String, java.lang.String> getenv();
  public static void exit(int);
  public static void gc();
  public static void runFinalization();
  public static void runFinalizersOnExit(boolean);
  public static void load(java.lang.String);
  public static void loadLibrary(java.lang.String);
  public static native java.lang.String mapLibraryName(java.lang.String);
  static {};
}

public abstract class java.io.InputStream implements java.io.Closeable {
  public java.io.InputStream();
  public abstract int read() throws java.io.IOException;
  public int read(byte[]) throws java.io.IOException;
  public int read(byte[], int, int) throws java.io.IOException;
  public long skip(long) throws java.io.IOException;
  public int available() throws java.io.IOException;
  public void close() throws java.io.IOException;
  public synchronized void mark(int);
  public synchronized void reset() throws java.io.IOException;
  public boolean markSupported();
}

public abstract class java.io.OutputStream implements java.io.Closeable,java.io.Flushable {
  public java.io.OutputStream();
  public abstract void write(int) throws java.io.IOException;
  public void write(byte[]) throws java.io.IOException;
  public void write(byte[], int, int) throws java.io.IOException;
  public void flush() throws java.io.IOException;
  public void close() throws java.io.IOException;
}

public class java.io.PrintStream extends java.io.FilterOutputStream implements java.lang.Appendable,java.io.Closeable {
  public java.io.PrintStream(java.io.OutputStream);
  public java.io.PrintStream(java.io.OutputStream, boolean);
  public java.io.PrintStream(java.io.OutputStream, boolean, java.lang.String) throws java.io.UnsupportedEncodingException;
  public java.io.PrintStream(java.lang.String) throws java.io.FileNotFoundException;
  public java.io.PrintStream(java.lang.String, java.lang.String) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException;
  public java.io.PrintStream(java.io.File) throws java.io.FileNotFoundException;
  public java.io.PrintStream(java.io.File, java.lang.String) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException;
  public void flush();
  public void close();
  public boolean checkError();
  protected void setError();
  protected void clearError();
  public void write(int);
  public void write(byte[], int, int);
  public void print(boolean);
  public void print(char);
  public void print(int);
  public void print(long);
  public void print(float);
  public void print(double);
  public void print(char[]);
  public void print(java.lang.String);
  public void print(java.lang.Object);
  public void println();
  public void println(boolean);
  public void println(char);
  public void println(int);
  public void println(long);
  public void println(float);
  public void println(double);
  public void println(char[]);
  public void println(java.lang.String);
  public void println(java.lang.Object);
  public java.io.PrintStream printf(java.lang.String, java.lang.Object...);
  public java.io.PrintStream printf(java.util.Locale, java.lang.String, java.lang.Object...);
  public java.io.PrintStream format(java.lang.String, java.lang.Object...);
  public java.io.PrintStream format(java.util.Locale, java.lang.String, java.lang.Object...);
  public java.io.PrintStream append(java.lang.CharSequence);
  public java.io.PrintStream append(java.lang.CharSequence, int, int);
  public java.io.PrintStream append(char);
  public java.lang.Appendable append(char) throws java.io.IOException;
  public java.lang.Appendable append(java.lang.CharSequence, int, int) throws java.io.IOException;
  public java.lang.Appendable append(java.lang.CharSequence) throws java.io.IOException;
}
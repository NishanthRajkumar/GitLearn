class Out
{
    private String buf;

    public Out()
    {
        buf = "";
    }

    public Out(String buf)
    {
        this.buf = buf;
    }

    public static <T> void ln(T obj)
    {
        System.out.println(obj);
    }

    public <T> void add(T obj)
    {
        buf += obj.toString();
    }

    public <T> void addln(T obj)
    {
        if (buf == "")
        {
            buf += obj.toString();
        }
        else
        {
            buf += "\n" + obj.toString();
        }
    }

    public void out()
    {
        System.out.println(buf);
    }

    public void clear()
    {
        buf = "";
    }
}

# How To: Write XER files
XER files have been imported and exported by Primavera software since the
earliest days of P6 and this format is still often the preferred way to
move schedule data between instances of P6 even today.

## Writing XER files
The sample code below illustrates how to write data to an XER file.

```java
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.writer.FileFormat;
import net.sf.mpxj.writer.UniversalProjectWriter;

// ...

new UniversalProjectWriter(FileFormat.XER).write(project, fileName);
```

## Using PrimaveraXERFileWriter
If required, the `PrimaveraXERFileWriter` class can be used directly, which
provides access to additional options, as described below.

### Encoding
By default XER files written by MPXJ are encoded using the Windows-1252
character set. If you need to use a different encoding, the `setCharset` or
`setEncoding` methods can be used to achieve this, as illustrated by the code
below.

```java
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.primavera.PrimaveraXERFileWriter;

// ...

PrimaveraXERFileWriter writer = new PrimaveraXERFileWriter();

// Use a Charset instance
writer.setCharset(Charset.forName("GB2312"));
writer.write(projectFile, outputFileName);

// Use an encoding name
writer.setEncoding("GB2312");
writer.write(projectFile, outputFileName);
```

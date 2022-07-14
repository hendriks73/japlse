[![LGPL 2.1](https://img.shields.io/badge/License-LGPL_2.1-blue.svg)](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/japlse/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/japlse)
[![Build and Test](https://github.com/japlscript/japlse/workflows/Build%20and%20Test/badge.svg)](https://github.com/japlscript/japlse/actions)


# JaplSE

*JaplSE* is a Java API for the AppleScript System Events based on
[JaplScript](https://github.com/japlscript/japlscript).


## Installation

JaplSE is released via [Maven](https://maven.apache.org).
You can install it via the following dependency:

```xml
<dependency>
    <groupId>com.tagtraum</groupId>
    <artifactId>japlse</artifactId>
</dependency>
```

The Maven artifacts also contain sources and javadocs. 

If you are using [modules](https://en.wikipedia.org/wiki/Java_Platform_Module_System),
its name is `tagtraum.japlse`.


## Usage
                           
To use the generated code, do something like this:

```java
import com.tagtraum.macos.systemevents.Application;

public class SendKeyStroke {

    public static void main(final String[] args) {
        final Application application = Application.getInstance();
        // send keystroke with no modifiers
        // to the frontmost app window
        application.keystroke("e", null);
    }
}
```
              
Or this:

```java
import com.tagtraum.macos.systemevents.Application;

public class GetDownloadsFolder {

    public static void main(final String[] args) {
        final Application application = Application.getInstance();
        final String downloadsFolder = application.getDownloadsFolder().getPosixPath();
        System.out.println("Downloads folder: " + downloadsFolder);
    }
}
```
## API

You can find the complete [API here](https://japlscript.github.io/japlse/com/tagtraum/macos/systemevents/package-summary.html). 


## Shipping

For information about shipping apps with this library, please see
the corresponding notes about signing, notarization etc. in the
[JaplScript documentation](https://github.com/japlscript/japlscript/blob/main/README.md).

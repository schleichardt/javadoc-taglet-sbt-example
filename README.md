## About

This is a proof of concept to include code examples to Javadoc.
These code examples should be at least compiled, but better tested.
So this example shows how to include the body of test cases in Javadoc.

### Result
![result](https://raw.github.com/schleichardt/javadoc-taglet-sbt-example/master/doc/screenshot-javadoc-result.png)

### The Javadoc of the Implementation Class
```java
/**
 * {@include.example info.schleichardt.Example#testUppercase()}
 *
 * <br>Or the second example:<br>
 *
 * {@include.example info.schleichardt.Example#testBla()}
 */
public class ImplementationClass {
...
```

### The Test File with the Examples
```java
package info.schleichardt;

import example.ImplementationClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Example {

    @Test
    public void testUppercase() throws Exception {
        final ImplementationClass service = new ImplementationClass();
        final String s = "hello";
        assertEquals(service.uppercase(s), s.toUpperCase());
    }

    @Test
    public void testBla() throws Exception {
        System.out.println("hello");
        System.out.println("code");
    }
}
```


```bash
sbt test doc
```

## Notice

THIS SOFTWARE IS PROVIDED BY THE AUTHORS ``AS IS'' AND ANY EXPRESS OR
IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

# Upgrade to Java 21 (LTS)

This repository does not contain a Maven or Gradle build file, so the automated Java upgrade tool is unavailable in this environment. The steps below explain how to upgrade your local development environment and how to verify Java 21 works for the repository on macOS (zsh).

Prerequisites
- macOS with zsh (your default shell)
- Homebrew (recommended) or a way to install JDKs

1) Install Java 21 (Adoptium/Eclipse Temurin) via Homebrew

Run in your terminal (zsh):

```bash
# Install Temurin 21
brew install --cask temurin21
```

2) Verify installation and set JAVA_HOME for this shell

```bash
# Show java version
/usr/libexec/java_home -V
java -version

# Set JAVA_HOME (for current shell session)
export JAVA_HOME=$(/usr/libexec/java_home -v21)
export PATH="$JAVA_HOME/bin:$PATH"

# Verify
java -version
javac -version
```

To make this persistent, add the export lines to your `~/.zshrc`:

```bash
echo 'export JAVA_HOME=$(/usr/libexec/java_home -v21)' >> ~/.zshrc
echo 'export PATH="$JAVA_HOME/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```

3) If you use an IDE (IntelliJ IDEA, VS Code, Eclipse)
- Update the project SDK/JDK to Java 21 in the IDE settings.

4) Project-level changes

This repository appears to be plain Java files without a centralized build file. If you plan to add a build system (recommended), create one of the following:

- Maven: add a `pom.xml` and set `<maven.compiler.source>21</maven.compiler.source>` and `<maven.compiler.target>21</maven.compiler.target>` in the `properties` section.
- Gradle (Groovy): in `build.gradle` set `java { toolchain { languageVersion = JavaLanguageVersion.of(21) } }` or set `sourceCompatibility = 21` / `targetCompatibility = 21`.

Example minimal `javac` compile command (from repo root):

```bash
# compile all .java files under the workspace into out/ (single-threaded)
mkdir -p out
find . -name "*.java" > sources.txt
javac -d out @sources.txt

# run a class (example: Two Sum solution doesn't have a main; create a small runner)
```

5) Run a small smoke test

- Create a tiny `Main.java` in a folder and compile/run it with the Java 21 toolchain to confirm compile/runtime compatibility.

6) Next steps (optional)
- Add a build tool (Maven/Gradle) to the repo so upgrades and CI checks become automated.
- If you want, I can:
  - Add a minimal `pom.xml` or `build.gradle` that targets Java 21.
  - Create a small `Main` runner and automated smoke tests.

Notes
- The automatic upgrade tool requires a Copilot Pro/Enterprise plan and isn't available in this environment. The instructions above are equivalent manual steps.

If you want, I can add a `pom.xml` or `build.gradle` targeting Java 21 and then run a local build/test cycle. Tell me which build system you prefer.

export projectpath=$(pwd)
export classpath=$projectpath/bin:$projectpath/JarFiles/*
java -cp $classpath org.testng.TestNG testng.xml
*Para ejecutar desde consola, nos debemos dirigir a la ubicacion del proyecto
su raiz, y en la ruta escribir cmd y ejecutar el comando necesario.

*De esta manera se ejecuta dfiniendo el proyecto y un ambiente
gradle clean test -Dtest=UtestRetoGradle -Denvironment=staging

*De esta manera se ejecuta dfiniendo el runner que querramos, se debe recordar que se pone el nombre que tenga la clase runner
clean test --tests Runner

*De esta manera se ejecuta definiendo el navegador y un ambiente
gradle clean test -Dwebdriver.driver=chrome -Denvironment=staging
Ejercicio 6 - Gestor de Temas y Apariencia Visual

Explicación del programa

En este ejercicio se creó una clase llamada GestorTema que aplica el patrón Singleton para centralizar y sincronizar el tema visual (Claro u Oscuro) en toda la aplicación sin fragmentar el estado entre diferentes vistas.
La clase cuenta con:
- Una variable estática privada llamada instancia.
- Un atributo privado llamado temaActual para almacenar el estado del tema visual.
- Un constructor privado que inicializa por defecto el tema en "Claro".
- Un método estático público llamado getInstancia() que devuelve siempre la misma referencia única.
- Métodos públicos para cambiar el tema y consultar su valor actual.

Luego, dentro del método main, se obtienen dos referencias al gestor:
GestorTema t1 = GestorTema.getInstancia();
GestorTema t2 = GestorTema.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar que ambas referencias son iguales, verificar el tema inicial, realizar un cambio de tema y comprobar que el estado se propaga correctamente a través de la otra referencia.

Lógica utilizada

La lógica del programa consiste en:
- Restringir la creación de objetos externos mediante un constructor privado.
- Controlar el acceso global a través de getInstancia() asegurando que todas las vistas compartan exactamente la misma instancia y el mismo estado visual.
- Permitir la modificación de los atributos de configuración únicamente a través de métodos controlados de la clase única.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia?: true
Tema inicial: Claro
Cambiando tema visual a: Oscuro
Tema actual desde t2: Oscuro

Captura de pantalla

<img width="599" height="206" alt="image" src="https://github.com/user-attachments/assets/6017a343-22fb-41a1-9f79-5f1cc45d5a8f" />


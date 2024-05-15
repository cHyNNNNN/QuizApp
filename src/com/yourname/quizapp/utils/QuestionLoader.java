package com.yourname.quizapp.utils;

import com.yourname.quizapp.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionLoader {
    public static List<Question> loadQuestions(String subjectName) {
        List<Question> questions = new ArrayList<>();

        switch (subjectName) {
            case "FOL":
                addFOLQuestions(questions);
                break;
            case "Programación A":
                addProgramacionAQuestions(questions);
                break;
            case "Programación B":
                addProgramacionBQuestions(questions);
                break;
            case "Lenguaje de Marcas":
                addLenguajeMarcasQuestions(questions);
                break;
            case "Bases de Datos B":
                addDatabaseQuestions(questions);
                break;
            case "Entornos de Desarrollo":
                addEntornosDesarrolloQuestions(questions);
                break;
        }

        return questions;
    }

    private static void addFOLQuestions(List<Question> questions) {
        questions.add(new Question("Pregunta 1 de FOL", new String[]{"Opción 1", "Opción 2", "Opción 3", "Opción 4"}, 0));
        // Añadir más preguntas de FOL...
    }

    private static void addProgramacionAQuestions(List<Question> questions) {
        questions.add(new Question("Pregunta 1 de Programación A", new String[]{"Opción 1", "Opción 2", "Opción 3", "Opción 4"}, 1));
        // Añadir más preguntas de Programación A...
    }

    private static void addProgramacionBQuestions(List<Question> questions) {
        questions.add(new Question("Pregunta 1 de Programación B", new String[]{"Opción 1", "Opción 2", "Opción 3", "Opción 4"}, 2));
        // Añadir más preguntas de Programación B...
    }

    private static void addLenguajeMarcasQuestions(List<Question> questions) {
        questions.add(new Question("Pregunta 1 de Lenguaje de Marcas", new String[]{"Opción 1", "Opción 2", "Opción 3", "Opción 4"}, 3));
        // Añadir más preguntas de Lenguaje de Marcas...
    }

    private static void addDatabaseQuestions(List<Question> questions) {
        questions.add(new Question("¿Qué comando se utiliza en Oracle para habilitar la visualización de mensajes en la consola?",
                new String[]{"SHOW MESSAGES ON", "ENABLE OUTPUT", "SET SERVEROUTPUT ON", "DISPLAY MESSAGES ON"},
                2));
        questions.add(new Question("¿Cuál es el propósito de la cláusula WHEN en un trigger en Oracle?",
                new String[]{"Indicar una condición para disparar el trigger", "Especificar el tiempo de ejecución del trigger", "Declarar variables locales", "Definir el cuerpo del trigger"},
                0));
        questions.add(new Question("¿Qué tipo de variable en PL/SQL no puede cambiar su valor una vez asignado?",
                new String[]{"VARIABLE", "CONSTANT", "FIXED", "IMMUTABLE"},
                1));
        questions.add(new Question("¿Qué tipo de cursor en PL/SQL se utiliza para manejar consultas que devuelven múltiples filas?",
                new String[]{"Implícito", "Temporal", "Explícito", "Dinámico"},
                2));
        questions.add(new Question("¿Cuál es el tipo de dato que permite almacenar gráficos, imágenes, videos y texto de hasta cuatro gigabytes en PL/SQL?",
                new String[]{"BLOB", "VARCHAR", "CLOB", "LOB"},
                3));
        questions.add(new Question("¿Cuál de las siguientes opciones es un atributo de un cursor explícito en PL/SQL?",
                new String[]{"%ISOPEN", "%CURRENT", "%NEXT", "%CLOSED"},
                0));
        questions.add(new Question("¿Qué palabra clave se usa en PL/SQL para declarar una excepción?",
                new String[]{"ERROR", "EXCEPTION", "RAISE", "CATCH"},
                1));
        questions.add(new Question("¿Qué comando se utiliza para crear un rol en Oracle?",
                new String[]{"CREATE ROLE", "ADD ROLE", "DEFINE ROLE", "NEW ROLE"},
                0));
        questions.add(new Question("¿Cuál de las siguientes afirmaciones es verdadera sobre los triggers en Oracle?",
                new String[]{"Se ejecutan automáticamente en respuesta a eventos específicos.", "Solo se pueden crear para tablas temporales.", "No pueden referenciar tablas en otras bases de datos.", "Se ejecutan solo una vez por sesión de usuario."},
                0));
        questions.add(new Question("¿Qué tipo de trigger se ejecuta antes de que se realice la operación de la base de datos en Oracle?",
                new String[]{"AFTER", "BEFORE", "INSTEAD OF", "DURING"},
                1));
        questions.add(new Question("¿Cuál es la principal diferencia entre una función y un procedimiento en PL/SQL?",
                new String[]{"Las funciones siempre devuelven un valor, los procedimientos no.", "Las funciones pueden tener parámetros, los procedimientos no.", "Los procedimientos son más rápidos que las funciones.", "Las funciones no pueden ser reutilizadas, los procedimientos sí."},
                0));
        questions.add(new Question("¿Qué comando se usa para asignar privilegios a un usuario en Oracle?",
                new String[]{"GIVE", "ASSIGN", "GRANT", "ALLOW"},
                2));
        questions.add(new Question("¿Qué tipo de colección en PL/SQL permite almacenar un conjunto de elementos del mismo tipo?",
                new String[]{"ARRAY", "LIST", "TABLE", "COLLECTION"},
                2));
        questions.add(new Question("¿Cuál es el propósito del comando ALTER USER en MySQL?",
                new String[]{"Crear un nuevo usuario", "Eliminar un usuario existente", "Modificar las propiedades de un usuario existente", "Asignar roles a un usuario"},
                2));
        questions.add(new Question("¿Qué palabra clave en PL/SQL se usa para definir una excepción propia del usuario?",
                new String[]{"RAISE", "EXCEPTION", "DECLARE", "DEFINE"},
                1));
        questions.add(new Question("¿Qué atributo de un cursor explícito indica si se ha encontrado una fila?",
                new String[]{"%ROWCOUNT", "%FOUND", "%NOTFOUND", "%ISOPEN"},
                1));
        questions.add(new Question("¿Qué tipo de excepción se produce si una sentencia SELECT no encuentra datos?",
                new String[]{"TOO_MANY_ROWS", "NO_DATA_FOUND", "ZERO_DIVIDE", "DATA_NOT_FOUND"},
                1));
        questions.add(new Question("¿Cuál es el comando para crear una función en PL/SQL?",
                new String[]{"CREATE PROCEDURE", "CREATE FUNCTION", "CREATE METHOD", "CREATE OPERATION"},
                1));
        questions.add(new Question("¿Qué tipo de variable se utiliza en PL/SQL para pasar valores tanto de entrada como de salida?",
                new String[]{"IN", "OUT", "IN OUT", "RETURN"},
                2));
        questions.add(new Question("¿Qué comando se utiliza para cerrar un cursor explícito en PL/SQL?",
                new String[]{"CLOSE CURSOR", "END CURSOR", "CLOSE", "FINISH CURSOR"},
                2));
        questions.add(new Question("¿Cuál de las siguientes afirmaciones es verdadera sobre los roles en Oracle?",
                new String[]{"Los roles no pueden tener contraseñas.", "Un rol puede ser asignado a sí mismo.", "Los roles pueden ser activados o desactivados temporalmente.", "Los roles solo pueden asignar permisos de lectura."},
                2));
        questions.add(new Question("¿Qué palabra clave se utiliza en PL/SQL para declarar un tipo compuesto?",
                new String[]{"TYPE", "CLASS", "RECORD", "OBJECT"},
                0));
        questions.add(new Question("¿Qué comando se utiliza en MySQL para eliminar un usuario?",
                new String[]{"REMOVE USER", "DELETE USER", "DROP USER", "ERASE USER"},
                2));
        questions.add(new Question("¿Cuál de las siguientes opciones es un privilegio de sistema en Oracle?",
                new String[]{"SELECT", "INSERT", "CREATE TABLE", "UPDATE"},
                2));
        questions.add(new Question("¿Qué palabra clave se utiliza en PL/SQL para indicar que una variable es constante?",
                new String[]{"STATIC", "FINAL", "CONSTANT", "IMMUTABLE"},
                2));
        questions.add(new Question("¿Cuál es el comando para crear un procedimiento en MySQL?",
                new String[]{"CREATE METHOD", "CREATE PROCEDURE", "CREATE FUNCTION", "CREATE OPERATION"},
                1));
        questions.add(new Question("¿Qué tipo de variable en PL/SQL puede almacenar múltiples filas y columnas de datos?",
                new String[]{"RECORD", "TABLE", "VARRAY", "NESTED TABLE"},
                3));
        questions.add(new Question("¿Qué palabra clave se utiliza en PL/SQL para lanzar una excepción?",
                new String[]{"THROW", "RAISE", "EXCEPTION", "SIGNAL"},
                1));
        questions.add(new Question("¿Cuál de las siguientes opciones es una estructura de control condicional en PL/SQL?",
                new String[]{"WHILE", "FOR", "CASE", "LOOP"},
                2));
        questions.add(new Question("¿Qué tipo de cursor en PL/SQL no requiere declaración explícita por parte del programador?",
                new String[]{"Explícito", "Implícito", "Temporal", "Dinámico"},
                1));
        questions.add(new Question("¿Qué comando se utiliza para otorgar un rol a un usuario en Oracle?",
                new String[]{"GIVE ROLE", "ASSIGN ROLE", "GRANT ROLE", "SET ROLE"},
                2));
        questions.add(new Question("¿Cuál es la palabra clave para declarar una función en PL/SQL?",
                new String[]{"FUNCTION", "METHOD", "PROCEDURE", "ROUTINE"},
                0));
        questions.add(new Question("¿Qué comando en MySQL se utiliza para listar todos los usuarios de la base de datos?",
                new String[]{"SHOW USERS", "LIST USERS", "SELECT * FROM mysql.user", "DISPLAY USERS"},
                2));
        questions.add(new Question("¿Qué comando se utiliza para revocar privilegios de un usuario en Oracle?",
                new String[]{"REVOKE", "REMOVE", "DENY", "DELETE"},
                0));
        questions.add(new Question("¿Cuál de los siguientes tipos de datos en PL/SQL se utiliza para almacenar números enteros?",
                new String[]{"VARCHAR", "BOOLEAN", "NUMBER", "BINARY_INTEGER"},
                3));
        questions.add(new Question("¿Qué palabra clave se usa en PL/SQL para definir una tabla anidada?",
                new String[]{"NESTED TABLE", "ARRAY", "LIST", "COLLECTION"},
                0));
        questions.add(new Question("¿Qué tipo de excepción en PL/SQL se produce cuando una sentencia SELECT devuelve más de una fila?",
                new String[]{"NO_DATA_FOUND", "TOO_MANY_ROWS", "ZERO_DIVIDE", "MULTIPLE_ROWS"},
                1));
        questions.add(new Question("¿Qué atributo de un cursor explícito en PL/SQL indica si se ha alcanzado el final del conjunto de filas?",
                new String[]{"%NOTFOUND", "%ISOPEN", "%ROWCOUNT", "%END"},
                0));
        questions.add(new Question("¿Qué palabra clave se usa en PL/SQL para indicar un parámetro de salida?",
                new String[]{"OUT", "IN", "RETURN", "EXIT"},
                0));
        questions.add(new Question("¿Qué comando se utiliza en Oracle para definir un trigger que se ejecuta después de una operación DML?",
                new String[]{"BEFORE", "AFTER", "INSTEAD OF", "DURING"},
                1));
        questions.add(new Question("¿Qué comando en MySQL se utiliza para crear una nueva tabla?",
                new String[]{"ADD TABLE", "NEW TABLE", "CREATE TABLE", "DEFINE TABLE"},
                2));
        questions.add(new Question("¿Cuál de las siguientes afirmaciones es verdadera sobre las vistas en una base de datos?",
                new String[]{"Las vistas almacenan datos físicamente.", "Las vistas son objetos virtuales que no almacenan datos.", "Las vistas no pueden ser consultadas.", "Las vistas son exclusivas de Oracle."},
                1));
        questions.add(new Question("¿Qué tipo de dato en PL/SQL se utiliza para almacenar una cadena de caracteres de longitud variable?",
                new String[]{"CHAR", "VARCHAR2", "STRING", "TEXT"},
                1));
        questions.add(new Question("¿Qué comando se utiliza en Oracle para modificar la estructura de una tabla existente?",
                new String[]{"ALTER TABLE", "MODIFY TABLE", "CHANGE TABLE", "UPDATE TABLE"},
                0));
        questions.add(new Question("¿Cuál de las siguientes opciones es un tipo de dato escalar en PL/SQL?",
                new String[]{"BLOB", "RECORD", "NUMBER", "NESTED TABLE"},
                2));
        questions.add(new Question("¿Qué comando se utiliza para crear un índice en una tabla en MySQL?",
                new String[]{"ADD INDEX", "NEW INDEX", "CREATE INDEX", "DEFINE INDEX"},
                2));
        questions.add(new Question("¿Cuál es el propósito de un cursor en PL/SQL?",
                new String[]{"Ejecutar una sentencia DML", "Recuperar y procesar filas de una consulta", "Crear una tabla temporal", "Definir un procedimiento almacenado"},
                1));
        questions.add(new Question("¿Qué comando se utiliza en MySQL para cambiar el nombre de una tabla existente?",
                new String[]{"RENAME TABLE", "ALTER TABLE", "MODIFY TABLE", "UPDATE TABLE"},
                0));
        questions.add(new Question("¿Cuál de las siguientes opciones es una estructura de control de iteración en PL/SQL?",
                new String[]{"IF", "CASE", "LOOP", "SELECT"},
                2));
        questions.add(new Question("¿Qué tipo de dato en PL/SQL se utiliza para almacenar valores booleanos?",
                new String[]{"BOOLEAN", "NUMBER", "CHAR", "VARCHAR2"},
                0));
        questions.add(new Question("¿Cuál es el propósito de la cláusula RETURN en una función en PL/SQL?",
                new String[]{"Indicar el tipo de dato de los parámetros", "Especificar el valor devuelto por la función", "Declarar variables locales", "Definir el cuerpo de la función"},
                1));
        questions.add(new Question("¿Qué comando se utiliza en Oracle para eliminar una vista existente?",
                new String[]{"DROP VIEW", "DELETE VIEW", "REMOVE VIEW", "ERASE VIEW"},
                0));
        questions.add(new Question("¿Cuál de las siguientes afirmaciones es verdadera sobre los cursores explícitos en PL/SQL?",
                new String[]{"No necesitan ser declarados.", "Son controlados explícitamente por el programador.", "Se utilizan exclusivamente para sentencias INSERT.", "No pueden devolver más de una fila."},
                1));
        questions.add(new Question("¿Qué palabra clave se utiliza en PL/SQL para definir una tabla temporal?",
                new String[]{"TEMPORARY", "TEMP", "TEMPORAL", "SESSION"},
                0));
        questions.add(new Question("¿Qué tipo de trigger en Oracle se ejecuta en lugar de una operación DML?",
                new String[]{"BEFORE", "AFTER", "INSTEAD OF", "DURING"},
                2));
        questions.add(new Question("¿Cuál de los siguientes tipos de datos en PL/SQL se utiliza para almacenar grandes bloques de datos no estructurados?",
                new String[]{"NUMBER", "VARCHAR2", "LOB", "BOOLEAN"},
                2));
        questions.add(new Question("¿Qué comando se utiliza en MySQL para eliminar una base de datos?",
                new String[]{"DELETE DATABASE", "REMOVE DATABASE", "DROP DATABASE", "ERASE DATABASE"},
                2));
        questions.add(new Question("¿Qué palabra clave en PL/SQL se utiliza para declarar una constante?",
                new String[]{"IMMUTABLE", "STATIC", "CONSTANT", "FINAL"},
                2));
        questions.add(new Question("¿Cuál de las siguientes afirmaciones es verdadera sobre las excepciones en PL/SQL?",
                new String[]{"Solo se pueden manejar excepciones definidas por el sistema.", "Las excepciones no se pueden manejar en PL/SQL.", "Las excepciones definidas por el usuario se pueden manejar con la palabra clave EXCEPTION.", "Las excepciones no pueden ser lanzadas explícitamente."},
                2));
        questions.add(new Question("¿Qué comando se utiliza en Oracle para modificar la definición de una función existente?",
                new String[]{"ALTER FUNCTION", "MODIFY FUNCTION", "UPDATE FUNCTION", "CHANGE FUNCTION"},
                0));
        questions.add(new Question("¿Cuál es el propósito de la cláusula EXCEPTION en un bloque PL/SQL?",
                new String[]{"Declarar variables locales", "Definir el cuerpo del bloque", "Manejar errores y excepciones", "Declarar constantes"},
                2));
        questions.add(new Question("¿Qué comando en MySQL se utiliza para crear un nuevo usuario?",
                new String[]{"ADD USER", "NEW USER", "CREATE USER", "DEFINE USER"},
                2));
        questions.add(new Question("¿Cuál de las siguientes opciones es un tipo de dato compuesto en PL/SQL?",
                new String[]{"BLOB", "VARCHAR2", "NUMBER", "RECORD"},
                3));
        questions.add(new Question("¿Qué comando se utiliza en Oracle para eliminar un procedimiento almacenado?",
                new String[]{"DROP PROCEDURE", "DELETE PROCEDURE", "REMOVE PROCEDURE", "ERASE PROCEDURE"},
                0));
        questions.add(new Question("¿Qué palabra clave se usa en PL/SQL para declarar una excepción?",
                new String[]{"ERROR", "EXCEPTION", "RAISE", "CATCH"},
                1));
    }

    private static void addEntornosDesarrolloQuestions(List<Question> questions) {
        questions.add(new Question("Pregunta 1 de Entornos de Desarrollo", new String[]{"Opción 1", "Opción 2", "Opción 3", "Opción 4"}, 1));
        // Añadir más preguntas de Entornos de Desarrollo...
    }
}

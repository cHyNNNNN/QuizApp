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
        questions.add(new Question("¿Qué es un plan de emergencia?",
                new String[]{"Un documento que prevé la organización de la respuesta ante situaciones de emergencia", "Un plan para aumentar la productividad", "Un informe sobre las finanzas de la empresa", "Una lista de contactos de emergencia"},
                0));
        questions.add(new Question("Según la Ley 31/1995, ¿quién está obligado a tener un plan de emergencia?",
                new String[]{"Ninguna empresa está obligada", "Solo las grandes empresas", "Solo las empresas pequeñas", "Todas las empresas con trabajadores por cuenta ajena"},
                3));
        questions.add(new Question("¿Qué debe definir un plan de emergencia?",
                new String[]{"Las vacaciones de los empleados", "El salario de los empleados", "La secuencia de actuaciones para controlar una emergencia", "El horario laboral"},
                2));
        questions.add(new Question("¿Qué deben incluir los planes de emergencia según el Real Decreto 393/2007?",
                new String[]{"Lista de empleados", "Plan de marketing", "Presupuesto anual", "Planes periódicos de formación y simulacros"},
                3));
        questions.add(new Question("¿Qué es un permiso por cuidado del lactante?",
                new String[]{"Un permiso de vacaciones", "Un permiso de maternidad", "Un permiso de paternidad", "Un permiso para ausentarse una hora al día hasta que el hijo cumpla 9 meses"},
                3));
        questions.add(new Question("¿Qué es la cotización a la Seguridad Social?",
                new String[]{"Una tasa de licencia", "Un impuesto sobre la renta", "El ingreso de cuotas por parte del empresario y el trabajador", "Un pago voluntario"},
                2));
        questions.add(new Question("¿Cuál es la duración máxima de la incapacidad temporal?",
                new String[]{"24 meses", "3 meses", "6 meses", "12 meses prorrogables a 6 más"},
                3));
        questions.add(new Question("¿Qué debe hacer un trabajador autónomo respecto a la Seguridad Social?",
                new String[]{"Comunicar la afiliación, alta, baja y variación de datos", "Pagar impuestos adicionales", "Solicitar un permiso especial", "Nada, no tiene obligaciones"},
                0));
        questions.add(new Question("¿Cuál es la duración máxima de la jornada laboral en España según el ET?",
                new String[]{"7 horas al día", "10 horas al día", "8 horas al día", "9 horas al día"},
                3));
        questions.add(new Question("¿Qué derecho tiene el trabajador respecto a las vacaciones?",
                new String[]{"No tiene derecho a vacaciones", "Puede trabajar durante las vacaciones", "Disfrutar de un periodo no inferior a 15 días naturales", "Disfrutar de un periodo no inferior a 30 días naturales por año trabajado"},
                3));
        questions.add(new Question("¿Qué tipo de descanso debe tener un trabajador menor de 18 años durante su jornada laboral?",
                new String[]{"Un descanso de 10 minutos cada hora", "Un descanso mínimo de 30 minutos si la jornada supera las 4 horas y media", "Un descanso mínimo de 15 minutos si la jornada supera las 4 horas", "No tiene derecho a descansos"},
                1));
        questions.add(new Question("¿Qué es una prestación por incapacidad temporal?",
                new String[]{"Una compensación al trabajador que deja de percibir ingresos durante el periodo de incapacidad", "Un bono de productividad", "Un incentivo anual", "Un aumento de sueldo"},
                0));
        questions.add(new Question("¿Qué tipo de horas extraordinarias existen?",
                new String[]{"Estructurales y de fuerza mayor", "Fijas y variables", "Diurnas y nocturnas", "Voluntarias y obligatorias"},
                0));
        questions.add(new Question("¿Cuál es la duración máxima de una jornada laboral al día para los menores de 18 años?",
                new String[]{"12 horas", "6 horas", "10 horas", "8 horas, incluyendo formación"},
                3));
        questions.add(new Question("¿Qué incluye el encabezamiento de una nómina?",
                new String[]{"El salario neto", "Datos identificativos de la empresa y del trabajador, y el periodo de liquidación", "Solo el nombre del trabajador", "Los días de vacaciones restantes"},
                1));
        questions.add(new Question("¿Qué se entiende por devengos en una nómina?",
                new String[]{"La suma de todas las cantidades que percibe el trabajador", "Los descuentos aplicados al salario", "Las horas extras trabajadas", "El salario neto percibido"},
                0));
        questions.add(new Question("¿Qué se excluye específicamente de la prestación por asistencia sanitaria de la Seguridad Social?",
                new String[]{"Cirugías estéticas", "Tratamientos hospitalarios", "Medicamentos para enfermedades crónicas", "Productos cosméticos, dietéticos, aguas minerales, elixires, dentífricos, medicamentos publicitarios y homeopáticos"},
                3));
        questions.add(new Question("¿Qué es la tarjeta sanitaria europea?",
                new String[]{"Una tarjeta de acceso a hospitales en España", "Un seguro de salud privado", "Un documento que acredita el derecho a recibir prestaciones sanitarias necesarias durante una estancia temporal en el EEE, Reino Unido o Suiza", "Una tarjeta de descuento en farmacias"},
                2));
        questions.add(new Question("¿Qué relación laboral se considera excluida del ordenamiento laboral?",
                new String[]{"Los empleados del hogar", "Los empleados de grandes empresas", "Los trabajadores a tiempo parcial", "Los autónomos"},
                3));
        questions.add(new Question("¿Qué información se debe incluir en un currículum vitae?",
                new String[]{"Solo la formación académica", "Datos personales, académicos, profesionales, idiomas, informática y otros datos de interés", "Solo la experiencia laboral", "Una foto del candidato"},
                1));
        questions.add(new Question("¿Qué es un videocurrículum?",
                new String[]{"Una entrevista de trabajo", "Un certificado académico", "Una presentación en video del aspirante al puesto de trabajo", "Un documento escrito"},
                2));
        questions.add(new Question("¿Qué se debe evitar en una entrevista de trabajo?",
                new String[]{"Mantener un tono de voz firme", "Mirar a los ojos", "Tener conocimiento previo de la empresa", "Cruzar los brazos o piernas demasiado tiempo"},
                3));
        questions.add(new Question("¿Qué es una entrevista semiestructurada?",
                new String[]{"Una entrevista solo con preguntas abiertas", "Una entrevista sin preparación previa", "Una entrevista con preguntas abiertas y cerradas", "Una entrevista con solo preguntas cerradas"},
                2));
        questions.add(new Question("¿Qué se entiende por conciliación laboral y familiar?",
                new String[]{"La reducción del salario para cuidar a la familia", "El trabajo desde casa", "El equilibrio entre las responsabilidades laborales y familiares", "El aumento de horas de trabajo"},
                2));
        questions.add(new Question("¿Qué es un derecho básico del trabajador según el ET?",
                new String[]{"Derecho a un aumento de sueldo", "Derecho a trabajar menos horas", "Derecho a la huelga", "Derecho a más días de vacaciones"},
                2));
        questions.add(new Question("¿Qué es una relación laboral ordinaria?",
                new String[]{"Una relación laboral temporal", "Una relación laboral no remunerada", "Una relación laboral a tiempo parcial", "Regulada por el Estatuto de los Trabajadores"},
                3));
        questions.add(new Question("¿Qué incluye una relación laboral especial?",
                new String[]{"Autónomos", "Deportistas profesionales", "Trabajadores a tiempo parcial", "Trabajadores temporales"},
                1));
        questions.add(new Question("¿Cuál es la finalidad de un plan de autoprotección?",
                new String[]{"Organizar los recursos materiales y humanos para responder ante emergencias", "Reducir costos operativos", "Incrementar la productividad", "Mejorar la comunicación interna"},
                0));
        questions.add(new Question("¿Qué se debe hacer en caso de emergencia según un plan de emergencia?",
                new String[]{"Cerrar todas las puertas y ventanas", "Activar la alarma y evacuar según las instrucciones del plan", "Continuar trabajando hasta recibir órdenes", "Ignorar la situación"},
                1));
        questions.add(new Question("¿Quién es responsable de poner en marcha el plan de emergencias?",
                new String[]{"Cualquier empleado disponible", "El trabajador más cercano", "El gerente de la empresa", "La persona identificada en el plan"},
                3));
        questions.add(new Question("¿Qué tipo de jornada laboral se conoce como jornada especial?",
                new String[]{"Una jornada de 6 horas", "Una jornada de 12 horas", "Una jornada de 8 horas", "Aquella con ampliaciones o reducciones según el sector"},
                3));
        questions.add(new Question("¿Cuál es el descanso mínimo diario entre jornadas laborales?",
                new String[]{"8 horas", "12 horas", "6 horas", "10 horas"},
                1));
        questions.add(new Question("¿Qué es la percepción puntual del salario?",
                new String[]{"El derecho a recibir el salario en las fechas acordadas", "El derecho a un salario más alto", "El derecho a recibir un bono anual", "El derecho a recibir salario en efectivo"},
                0));
        questions.add(new Question("¿Qué se debe evitar en la redacción de un currículum?",
                new String[]{"Agregar datos académicos", "Adjuntar una foto", "Utilizar la primera persona", "Incluir experiencia laboral"},
                2));
        questions.add(new Question("¿Qué es una jornada laboral?",
                new String[]{"El periodo de tiempo durante el cual el trabajador debe desarrollar su prestación laboral", "El tiempo de descanso entre jornadas", "Las horas dedicadas a reuniones", "El tiempo de vacaciones"},
                0));
        questions.add(new Question("¿Qué es un convenio colectivo?",
                new String[]{"Una normativa interna de la empresa", "Una ley del gobierno", "Un acuerdo verbal entre empleados", "Un acuerdo entre los representantes de los trabajadores y la empresa sobre las condiciones laborales"},
                3));
        questions.add(new Question("¿Qué es una relación laboral excluida?",
                new String[]{"Las relaciones de los trabajadores a tiempo parcial", "Las relaciones de los autónomos", "Las relaciones laborales de los empleados públicos", "Las relaciones laborales de los trabajadores temporales"},
                1));
        questions.add(new Question("¿Qué se considera una infracción muy grave en una entrevista de trabajo?",
                new String[]{"Hacer preguntas sobre la experiencia laboral", "Solicitar datos personales que puedan discriminar", "Inquirir sobre la formación académica", "Preguntar sobre las expectativas salariales"},
                1));
        questions.add(new Question("¿Qué derecho tiene el trabajador respecto a la jornada laboral?",
                new String[]{"Derecho a un descanso mínimo diario y semanal", "Derecho a trabajar sin interrupciones", "Derecho a trabajar más horas si lo desea", "Derecho a no trabajar los fines de semana"},
                0));
        questions.add(new Question("¿Qué es el Estatuto de los Trabajadores?",
                new String[]{"Un reglamento municipal", "Una ley europea", "Un documento interno de la empresa", "La norma que regula los derechos y deberes laborales en España"},
                3));
        questions.add(new Question("¿Qué es el salario base?",
                new String[]{"El salario neto después de deducciones", "El pago por horas extras", "La parte del salario que se fija por unidad de obra o de tiempo", "El total del salario bruto"},
                2));
        questions.add(new Question("¿Qué es la Seguridad Social?",
                new String[]{"Un sistema público que ofrece prestaciones ante ciertas contingencias", "Una entidad bancaria", "Un seguro privado", "Un fondo de ahorro"},
                0));
        questions.add(new Question("¿Cuál es la principal obligación del empresario respecto a la nómina?",
                new String[]{"Entregar el documento al trabajador con todos los detalles de las percepciones y deducciones", "No tiene ninguna obligación", "Pagar en efectivo", "Aumentar el salario cada año"},
                0));
        questions.add(new Question("¿Qué se entiende por devengos en una nómina?",
                new String[]{"La suma de todas las cantidades que percibe el trabajador", "El salario neto percibido", "Las horas extras trabajadas", "Los descuentos aplicados al salario"},
                0));
        questions.add(new Question("¿Qué se excluye específicamente de la prestación por asistencia sanitaria de la Seguridad Social?",
                new String[]{"Productos cosméticos, dietéticos, aguas minerales, elixires, dentífricos, medicamentos publicitarios y homeopáticos", "Medicamentos para enfermedades crónicas", "Cirugías estéticas", "Tratamientos hospitalarios"},
                0));
        questions.add(new Question("¿Qué es la tarjeta sanitaria europea?",
                new String[]{"Una tarjeta de descuento en farmacias", "Un seguro de salud privado", "Una tarjeta de acceso a hospitales en España", "Un documento que acredita el derecho a recibir prestaciones sanitarias necesarias durante una estancia temporal en el EEE, Reino Unido o Suiza"},
                3));
        questions.add(new Question("¿Qué relación laboral se considera excluida del ordenamiento laboral?",
                new String[]{"Los autónomos", "Los trabajadores a tiempo parcial", "Los empleados del hogar", "Los empleados de grandes empresas"},
                0));
        questions.add(new Question("¿Qué información se debe incluir en un currículum vitae?",
                new String[]{"Solo la formación académica", "Una foto del candidato", "Solo la experiencia laboral", "Datos personales, académicos, profesionales, idiomas, informática y otros datos de interés"},
                3));
        questions.add(new Question("¿Qué es un videocurrículum?",
                new String[]{"Un documento escrito", "Una presentación en video del aspirante al puesto de trabajo", "Una entrevista de trabajo", "Un certificado académico"},
                1));
        questions.add(new Question("¿Qué se debe evitar en una entrevista de trabajo?",
                new String[]{"Mantener un tono de voz firme", "Cruzar los brazos o piernas demasiado tiempo", "Tener conocimiento previo de la empresa", "Mirar a los ojos"},
                1));
        questions.add(new Question("¿Qué es una entrevista semiestructurada?",
                new String[]{"Una entrevista con preguntas abiertas y cerradas", "Una entrevista con solo preguntas cerradas", "Una entrevista solo con preguntas abiertas", "Una entrevista sin preparación previa"},
                0));
        questions.add(new Question("¿Qué se entiende por conciliación laboral y familiar?",
                new String[]{"El equilibrio entre las responsabilidades laborales y familiares", "El aumento de horas de trabajo", "El trabajo desde casa", "La reducción del salario para cuidar a la familia"},
                0));
        questions.add(new Question("¿Qué es un derecho básico del trabajador según el ET?",
                new String[]{"Derecho a trabajar menos horas", "Derecho a la huelga", "Derecho a un aumento de sueldo", "Derecho a más días de vacaciones"},
                1));
        questions.add(new Question("¿Qué es una relación laboral ordinaria?",
                new String[]{"Regulada por el Estatuto de los Trabajadores", "Una relación laboral no remunerada", "Una relación laboral a tiempo parcial", "Una relación laboral temporal"},
                0));
        questions.add(new Question("¿Qué incluye una relación laboral especial?",
                new String[]{"Autónomos", "Trabajadores a tiempo parcial", "Deportistas profesionales", "Trabajadores temporales"},
                2));
        questions.add(new Question("¿Cuál es la finalidad de un plan de autoprotección?",
                new String[]{"Organizar los recursos materiales y humanos para responder ante emergencias", "Incrementar la productividad", "Mejorar la comunicación interna", "Reducir costos operativos"},
                0));
        questions.add(new Question("¿Qué se debe hacer en caso de emergencia según un plan de emergencia?",
                new String[]{"Cerrar todas las puertas y ventanas", "Continuar trabajando hasta recibir órdenes", "Activar la alarma y evacuar según las instrucciones del plan", "Ignorar la situación"},
                2));
        questions.add(new Question("¿Quién es responsable de poner en marcha el plan de emergencias?",
                new String[]{"Cualquier empleado disponible", "El trabajador más cercano", "La persona identificada en el plan", "El gerente de la empresa"},
                2));
        questions.add(new Question("¿Qué tipo de jornada laboral se conoce como jornada especial?",
                new String[]{"Una jornada de 12 horas", "Una jornada de 8 horas", "Aquella con ampliaciones o reducciones según el sector", "Una jornada de 6 horas"},
                2));
        questions.add(new Question("¿Cuál es el descanso mínimo diario entre jornadas laborales?",
                new String[]{"8 horas", "12 horas", "6 horas", "10 horas"},
                1));
        questions.add(new Question("¿Qué es la percepción puntual del salario?",
                new String[]{"El derecho a recibir el salario en las fechas acordadas", "El derecho a un salario más alto", "El derecho a recibir un bono anual", "El derecho a recibir salario en efectivo"},
                0));
        questions.add(new Question("¿Qué se debe evitar en la redacción de un currículum?",
                new String[]{"Agregar datos académicos", "Utilizar la primera persona", "Incluir experiencia laboral", "Adjuntar una foto"},
                1));
        questions.add(new Question("¿Qué es una jornada laboral?",
                new String[]{"El periodo de tiempo durante el cual el trabajador debe desarrollar su prestación laboral", "El tiempo de descanso entre jornadas", "Las horas dedicadas a reuniones", "El tiempo de vacaciones"},
                0));
        questions.add(new Question("¿Qué es un convenio colectivo?",
                new String[]{"Un acuerdo entre los representantes de los trabajadores y la empresa sobre las condiciones laborales", "Una ley del gobierno", "Una normativa interna de la empresa", "Un acuerdo verbal entre empleados"},
                0));
        questions.add(new Question("¿Qué es una relación laboral excluida?",
                new String[]{"Las relaciones de los autónomos", "Las relaciones de los trabajadores a tiempo parcial", "Las relaciones laborales de los empleados públicos", "Las relaciones laborales de los trabajadores temporales"},
                0));
        questions.add(new Question("¿Qué se considera una infracción muy grave en una entrevista de trabajo?",
                new String[]{"Hacer preguntas sobre la experiencia laboral", "Solicitar datos personales que puedan discriminar", "Inquirir sobre la formación académica", "Preguntar sobre las expectativas salariales"},
                1));
        questions.add(new Question("¿Qué derecho tiene el trabajador respecto a la jornada laboral?",
                new String[]{"Derecho a un descanso mínimo diario y semanal", "Derecho a trabajar sin interrupciones", "Derecho a trabajar más horas si lo desea", "Derecho a no trabajar los fines de semana"},
                0));
        questions.add(new Question("¿Qué es el Estatuto de los Trabajadores?",
                new String[]{"Una ley europea", "Un reglamento municipal", "Un documento interno de la empresa", "La norma que regula los derechos y deberes laborales en España"},
                3));
        questions.add(new Question("¿Qué es el salario base?",
                new String[]{"El salario neto después de deducciones", "El pago por horas extras", "La parte del salario que se fija por unidad de obra o de tiempo", "El total del salario bruto"},
                2));
        questions.add(new Question("¿Qué es la Seguridad Social?",
                new String[]{"Un sistema público que ofrece prestaciones ante ciertas contingencias", "Un seguro privado", "Un fondo de ahorro", "Una entidad bancaria"},
                0));
        questions.add(new Question("¿Cuál es la principal obligación del empresario respecto a la nómina?",
                new String[]{"Entregar el documento al trabajador con todos los detalles de las percepciones y deducciones", "No tiene ninguna obligación", "Pagar en efectivo", "Aumentar el salario cada año"},
                0));


    }

    private static void addProgramacionAQuestions(List<Question> questions) {
        questions.add(new Question("¿Qué es un módulo en programación?",
                new String[]{"Un tipo de variable", "Una parte del código que se encarga de una función específica", "Una constante", "Un tipo de bucle"},
                1));
        questions.add(new Question("¿Cuál es la ventaja de usar programación modular?",
                new String[]{"Aumenta el tamaño del código", "Facilita la reutilización del código", "Hace el código más difícil de entender", "Reduce la flexibilidad del código"},
                1));
        questions.add(new Question("¿Qué palabra clave se utiliza para definir un módulo en muchos lenguajes de programación?",
                new String[]{"def", "function", "module", "begin"},
                2));
        questions.add(new Question("¿Cuál es la función principal de un módulo?",
                new String[]{"Encapsular una tarea específica del programa", "Definir variables globales", "Implementar bucles", "Generar errores"},
                0));
        questions.add(new Question("¿Qué es la encapsulación en la programación modular?",
                new String[]{"La declaración de variables globales", "El uso de constantes", "La implementación de interfaces", "La ocultación de los detalles de implementación de un módulo"},
                3));
        questions.add(new Question("¿Qué es una interfaz en la programación modular?",
                new String[]{"Un conjunto de métodos que un módulo debe implementar", "Una variable global", "Un tipo de bucle", "Un tipo de constante"},
                0));
        questions.add(new Question("¿Qué es un procedimiento en la programación modular?",
                new String[]{"Una secuencia de instrucciones que realizan una tarea específica", "Una variable global", "Un tipo de bucle", "Un tipo de constante"},
                0));
        questions.add(new Question("¿Qué es una función en la programación modular?",
                new String[]{"Una variable global", "Un bloque de código que realiza una tarea y devuelve un valor", "Un tipo de bucle", "Un tipo de constante"},
                1));
        questions.add(new Question("¿Cuál es la diferencia entre una función y un procedimiento?",
                new String[]{"Una función devuelve un valor, un procedimiento no", "Un procedimiento devuelve un valor, una función no", "Ambos son lo mismo", "Ninguna de las anteriores"},
                0));
        questions.add(new Question("¿Qué es una librería en la programación modular?",
                new String[]{"Un conjunto de módulos reutilizables", "Un tipo de variable", "Un bucle específico", "Una constante"},
                0));
        questions.add(new Question("¿Qué es la programación modular?",
                new String[]{"Un lenguaje de programación específico", "Una técnica para optimizar bucles", "Un método para gestionar memoria", "Un paradigma que divide un problema en subproblemas independientes"},
                3));
        questions.add(new Question("¿Cuál es una ventaja clave de la programación modular?",
                new String[]{"Aumenta la complejidad del código", "Facilita el mantenimiento y la modificación del código", "Requiere más memoria", "Disminuye la eficiencia del programa"},
                1));
        questions.add(new Question("¿Qué técnica de diseño se basa en dividir un problema grande en subproblemas más pequeños?",
                new String[]{"Análisis ascendente (bottom up)", "Análisis lateral", "Ninguna de las anteriores", "Análisis descendente (top down)"},
                3));
        questions.add(new Question("¿Qué es un subprograma?",
                new String[]{"Una parte independiente del código que realiza una tarea específica", "Una variable global", "Un tipo de bucle", "Una constante"},
                0));
        questions.add(new Question("¿Qué palabra clave se usa en C# para definir una función que no devuelve un valor?",
                new String[]{"int", "return", "void", "static"},
                2));
        questions.add(new Question("¿Qué es una función en C#?",
                new String[]{"Un tipo de variable", "Un tipo de bucle", "Una constante", "Un conjunto de instrucciones que tiene un nombre y un tipo específico"},
                3));
        questions.add(new Question("¿Qué son los modificadores de acceso en C#?",
                new String[]{"Palabras reservadas que aplican propiedades a las funciones", "Tipos de variables", "Tipos de bucles", "Constantes"},
                0));
        questions.add(new Question("¿Qué modificador de acceso permite que una función sea accesible desde cualquier parte del programa?",
                new String[]{"Private", "Protected", "Internal", "Public"},
                3));
        questions.add(new Question("¿Qué es un método no tipado en C#?",
                new String[]{"Un método que realiza una tarea específica y no devuelve un valor", "Un método que devuelve un valor entero", "Un método que devuelve un valor de punto flotante", "Un método que devuelve una cadena"},
                0));
        questions.add(new Question("¿Cómo se denomina la función principal en un programa C#?",
                new String[]{"main()", "start()", "begin()", "run()"},
                0));
        questions.add(new Question("¿Cuál es la forma correcta de pasar datos entre métodos en C#?",
                new String[]{"Usando constantes", "Usando bucles", "Usando variables globales", "Usando parámetros y valores devueltos"},
                3));
        questions.add(new Question("¿Qué es una variable global?",
                new String[]{"Una variable accesible desde cualquier parte del programa", "Una variable que solo puede ser usada dentro de una función", "Una constante", "Un tipo de bucle"},
                0));
        questions.add(new Question("¿Qué es una variable local?",
                new String[]{"Una constante", "Una variable accesible desde cualquier parte del programa", "Un tipo de bucle", "Una variable que solo puede ser usada dentro de una función"},
                3));
        questions.add(new Question("¿Qué palabra clave en C# se usa para pasar parámetros por referencia y no permitir su modificación dentro del método?",
                new String[]{"out", "in", "ref", "pass"},
                1));
        questions.add(new Question("¿Qué palabra clave en C# se usa para pasar parámetros por referencia y permitir su modificación dentro del método?",
                new String[]{"out", "in", "ref", "pass"},
                0));
        questions.add(new Question("¿Qué permite la palabra clave 'ref' en C#?",
                new String[]{"Declarar una variable global", "Definir un bucle", "Pasar parámetros por referencia permitiendo su modificación", "Pasar parámetros por valor"},
                2));
        questions.add(new Question("¿Qué es la recursividad?",
                new String[]{"El uso de variables globales", "El uso de bucles anidados", "La implementación de interfaces", "La llamada de una función a sí misma"},
                3));
        questions.add(new Question("¿Qué necesita una función recursiva para evitar un bucle infinito?",
                new String[]{"Un caso base", "Una variable global", "Un bucle", "Una constante"},
                0));
        questions.add(new Question("¿Qué es un caso base en una función recursiva?",
                new String[]{"Un bucle infinito", "Una constante", "Una variable global", "La condición que permite finalizar la recursividad"},
                3));
        questions.add(new Question("¿Qué es una librería en C#?",
                new String[]{"Un archivo que contiene métodos reutilizables", "Un tipo de variable", "Un tipo de bucle", "Una constante"},
                0));
        questions.add(new Question("¿Qué es la función 'Main' en C#?",
                new String[]{"La función principal que se ejecuta al iniciar el programa", "Una variable global", "Un tipo de bucle", "Una constante"},
                0));
        questions.add(new Question("¿Qué permite la depuración de programas?",
                new String[]{"Declarar variables globales", "Ejecutar bucles", "Implementar interfaces", "Identificar y corregir errores en el código"},
                3));
        questions.add(new Question("¿Qué es un error de compilación?",
                new String[]{"Un error en la lógica del programa", "Un error que ocurre durante la ejecución del programa", "Un tipo de bucle", "Un error que ocurre mientras se escribe el código y se detecta antes de la ejecución"},
                3));
        questions.add(new Question("¿Qué es un error de ejecución?",
                new String[]{"Un error que ocurre durante la ejecución del programa", "Un error que ocurre mientras se escribe el código", "Un error en la lógica del programa", "Un tipo de bucle"},
                0));
        questions.add(new Question("¿Qué es un error lógico?",
                new String[]{"Un tipo de bucle", "Un error que ocurre mientras se escribe el código", "Un error en la lógica del programa que produce resultados incorrectos", "Un error que ocurre durante la ejecución del programa"},
                2));
        questions.add(new Question("¿Qué es la compilación en el desarrollo de software?",
                new String[]{"La identificación de errores lógicos", "La ejecución de un programa", "La declaración de variables globales", "El proceso de traducir el código fuente a código máquina"},
                3));
        questions.add(new Question("¿Qué es la vinculación en el desarrollo de software?",
                new String[]{"La identificación de errores lógicos", "La ejecución de un programa", "La declaración de variables globales", "El proceso de unir las bibliotecas y clases necesarias para ejecutar un programa"},
                3));
        questions.add(new Question("¿Qué permite la palabra clave 'return' en una función en C#?",
                new String[]{"Definir un bucle", "Ejecutar un método", "Devolver un valor desde la función", "Declarar una variable global"},
                2));
        questions.add(new Question("¿Qué es el ámbito de una variable?",
                new String[]{"El valor de la variable", "El tipo de la variable", "La longitud de la variable", "La parte del código donde la variable es accesible"},
                3));
        questions.add(new Question("¿Qué es una variable local?",
                new String[]{"Una variable accesible desde cualquier parte del programa", "Una constante", "Un tipo de bucle", "Una variable que solo puede ser utilizada dentro de una función específica"},
                3));
        questions.add(new Question("¿Qué es una variable global?",
                new String[]{"Una variable accesible desde cualquier parte del programa", "Una constante", "Un tipo de bucle", "Una variable que solo puede ser utilizada dentro de una función específica"},
                0));
        questions.add(new Question("¿Qué palabra clave en C# se usa para definir una función que devuelve un valor?",
                new String[]{"int", "return", "void", "static"},
                1));
        questions.add(new Question("¿Qué es un método en C#?",
                new String[]{"Un tipo de variable", "Un tipo de bucle", "Una constante", "Un conjunto de instrucciones que realiza una tarea específica y puede devolver un valor"},
                3));
        questions.add(new Question("¿Qué permite la palabra clave 'void' en C#?",
                new String[]{"Declarar una variable global", "Implementar un bucle", "Ejecutar un método", "Definir una función que no devuelve un valor"},
                3));
        questions.add(new Question("¿Qué es una llamada a función en programación?",
                new String[]{"La declaración de una variable global", "La implementación de un bucle", "La ejecución de un método", "El proceso de invocar la ejecución de una función específica"},
                3));
        questions.add(new Question("¿Qué es el paso de parámetros por valor?",
                new String[]{"Pasar una referencia a una variable a una función", "Declarar una variable global", "Implementar un bucle", "Pasar una copia del valor de una variable a una función"},
                3));
        questions.add(new Question("¿Qué es el paso de parámetros por referencia?",
                new String[]{"Pasar una copia del valor de una variable a una función", "Declarar una variable global", "Implementar un bucle", "Pasar una referencia a una variable a una función"},
                3));
        questions.add(new Question("¿Qué permite la palabra clave 'out' en C#?",
                new String[]{"Pasar parámetros por referencia permitiendo su modificación dentro del método", "Pasar parámetros por valor", "Declarar una variable global", "Definir un bucle"},
                0));
        questions.add(new Question("¿Qué es una función recursiva?",
                new String[]{"Una función que declara variables globales", "Una función que no devuelve un valor", "Una función que solo se ejecuta una vez", "Una función que se llama a sí misma"},
                3));
        questions.add(new Question("¿Qué es un caso recursivo en una función recursiva?",
                new String[]{"Una constante", "Una variable global", "La condición que permite finalizar la recursividad", "La parte de la función que se llama a sí misma"},
                3));
        questions.add(new Question("¿Qué es una librería de clases en C#?",
                new String[]{"Un tipo de variable", "Un tipo de bucle", "Una constante", "Un archivo que contiene clases reutilizables"},
                3));
        questions.add(new Question("¿Qué permite la palabra clave 'static' en C#?",
                new String[]{"Definir una función que pertenece a la clase en lugar de a una instancia de la clase", "Declarar una variable global", "Implementar un bucle", "Ejecutar un método"},
                0));
        questions.add(new Question("¿Qué es una función de nivel superior en C#?",
                new String[]{"Una constante", "Una variable global", "Una función que no está definida dentro de otra función", "Una función que está definida dentro de otra función"},
                2));
        questions.add(new Question("¿Qué es un método de instancia en C#?",
                new String[]{"Un método que requiere una instancia de una clase para ser invocado", "Una constante", "Una variable global", "Un método que no requiere una instancia de una clase para ser invocado"},
                0));
        questions.add(new Question("¿Qué es un método estático en C#?",
                new String[]{"Una constante", "Una variable global", "Un método que no requiere una instancia de una clase para ser invocado", "Un método que requiere una instancia de una clase para ser invocado"},
                2));
        questions.add(new Question("¿Qué es una función genérica en C#?",
                new String[]{"Una función que solo trabaja con enteros", "Una función que solo trabaja con cadenas", "Una función que solo trabaja con variables globales", "Una función que puede trabajar con cualquier tipo de dato"},
                3));
        questions.add(new Question("¿Qué permite el uso de parámetros en una función?",
                new String[]{"La comunicación de datos entre la función y el código que la llama", "La declaración de variables globales", "La implementación de bucles", "La ejecución de métodos"},
                0));
        questions.add(new Question("¿Qué es una declaración de función en C#?",
                new String[]{"La definición del nombre, tipo y parámetros de una función", "La ejecución de una función", "La implementación de un bucle", "La declaración de variables globales"},
                0));
        questions.add(new Question("¿Qué es una implementación de función en C#?",
                new String[]{"La declaración del nombre, tipo y parámetros de una función", "La ejecución de una función", "La declaración de variables globales", "El código que define lo que hace la función"},
                3));
        questions.add(new Question("¿Qué es una llamada a función en C#?",
                new String[]{"La declaración del nombre, tipo y parámetros de una función", "La implementación de una función", "La declaración de variables globales", "El código que invoca la ejecución de una función"},
                3));
        questions.add(new Question("¿Qué es una función anónima en C#?",
                new String[]{"Una función sin nombre que se puede definir inline", "Una función que solo se ejecuta una vez", "Una función que declara variables globales", "Una función que no devuelve un valor"},
                0));
        questions.add(new Question("¿Qué es una función lambda en C#?",
                new String[]{"Una función que solo se ejecuta una vez", "Una función que declara variables globales", "Una función que no devuelve un valor", "Una función anónima que se puede definir inline con una sintaxis específica"},
                3));
        questions.add(new Question("¿Qué es una función de orden superior en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que toma una o más funciones como parámetros o devuelve una función"},
                3));
        questions.add(new Question("¿Qué es una función parcial en C#?",
                new String[]{"Una función que se puede definir en varias partes diferentes de un programa", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de miembro en C#?",
                new String[]{"Una función que no pertenece a ninguna clase", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que pertenece a una clase o un objeto"},
                3));
        questions.add(new Question("¿Qué es una función de clase en C#?",
                new String[]{"Una función que pertenece a una instancia de la clase", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que pertenece a la clase en lugar de a una instancia de la clase"},
                3));
        questions.add(new Question("¿Qué es una función de instancia en C#?",
                new String[]{"Una función que requiere una instancia de la clase para ser llamada", "Una función que pertenece a la clase en lugar de a una instancia de la clase", "Una función que no devuelve un valor", "Una función que declara variables globales"},
                0));
        questions.add(new Question("¿Qué es una función de extensión en C#?",
                new String[]{"Una función que añade métodos a tipos existentes sin modificar el tipo original", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de ayuda en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que proporciona funcionalidad auxiliar a otras funciones"},
                3));
        questions.add(new Question("¿Qué es una función de inicialización en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que se utiliza para inicializar variables o estados"},
                3));
        questions.add(new Question("¿Qué es una función de limpieza en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que se utiliza para liberar recursos o limpiar estados"},
                3));
        questions.add(new Question("¿Qué es una función de utilidad en C#?",
                new String[]{"Una función que realiza tareas comunes y reutilizables", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de validación en C#?",
                new String[]{"Una función que comprueba si los datos cumplen con ciertos criterios", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de conversión en C#?",
                new String[]{"Una función que solo trabaja con variables globales", "Una función que solo trabaja con cadenas", "Una función que convierte datos de un tipo a otro", "Una función que solo trabaja con enteros"},
                2));
        questions.add(new Question("¿Qué es una función de cálculo en C#?",
                new String[]{"Una función que realiza cálculos matemáticos o lógicos", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de transformación en C#?",
                new String[]{"Una función que toma datos de entrada y los transforma en datos de salida", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de agregación en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que combina múltiples valores en un solo valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                1));
        questions.add(new Question("¿Qué es una función de reducción en C#?",
                new String[]{"Una función que toma una colección de valores y los reduce a un solo valor", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de filtrado en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que selecciona valores de una colección basándose en un criterio", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                1));
        questions.add(new Question("¿Qué es una función de búsqueda en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que encuentra un valor específico en una colección"},
                3));
        questions.add(new Question("¿Qué es una función de ordenación en C#?",
                new String[]{"Una función que organiza los elementos de una colección en un orden específico", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de generación en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que crea nuevos valores o estructuras de datos", "Una función que solo se ejecuta una vez"},
                2));
        questions.add(new Question("¿Qué es una función de acceso en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que proporciona acceso a los datos de una clase u objeto", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                1));
        questions.add(new Question("¿Qué es una función de modificación en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que cambia los datos de una clase u objeto", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                1));
        questions.add(new Question("¿Qué es una función de eliminación en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que elimina datos de una clase u objeto", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                1));
        questions.add(new Question("¿Qué es una función de entrada en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que recibe datos del usuario o de una fuente externa"},
                3));
        questions.add(new Question("¿Qué es una función de salida en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que envía datos al usuario o a una fuente externa"},
                3));
        questions.add(new Question("¿Qué es una función de control en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que controla el flujo de ejecución del programa"},
                3));
        questions.add(new Question("¿Qué es una función de supervisión en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que monitorea el estado del programa o de sus componentes", "Una función que solo se ejecuta una vez"},
                2));
        questions.add(new Question("¿Qué es una función de diagnóstico en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que analiza y reporta el estado del programa o de sus componentes"},
                3));
        questions.add(new Question("¿Qué es una función de recuperación en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que intenta recuperar el estado del programa después de un error"},
                3));
        questions.add(new Question("¿Qué es una función de seguridad en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que protege el programa o sus datos de accesos no autorizados"},
                3));
        questions.add(new Question("¿Qué es una función de auditoría en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que registra las acciones y eventos del programa para su análisis posterior"},
                3));
        questions.add(new Question("¿Qué es una función de configuración en C#?",
                new String[]{"Una función que establece o modifica la configuración del programa", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de actualización en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que actualiza los datos o el estado del programa"},
                3));
        questions.add(new Question("¿Qué es una función de sincronización en C#?",
                new String[]{"Una función que coordina la ejecución de múltiples hilos o procesos", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de importación en C#?",
                new String[]{"Una función que trae datos de una fuente externa al programa", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de exportación en C#?",
                new String[]{"Una función que envía datos del programa a una fuente externa", "Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez"},
                0));
        questions.add(new Question("¿Qué es una función de manipulación en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que modifica datos de alguna manera"},
                3));
        questions.add(new Question("¿Qué es una función de análisis en C#?",
                new String[]{"Una función que no devuelve un valor", "Una función que declara variables globales", "Una función que solo se ejecuta una vez", "Una función que examina datos y extrae información útil"},
                3));
        questions.add(new Question("¿Qué es un módulo en programación?",
                new String[]{"Un tipo de variable", "Una constante", "Una parte del código que se encarga de una función específica", "Un tipo de bucle"},
                2));
        questions.add(new Question("¿Cuál es la ventaja de usar programación modular?",
                new String[]{"Hace el código más difícil de entender", "Facilita la reutilización del código", "Reduce la flexibilidad del código", "Aumenta el tamaño del código"},
                1));
        questions.add(new Question("¿Qué palabra clave se utiliza para definir un módulo en muchos lenguajes de programación?",
                new String[]{"begin", "module", "function", "def"},
                1));
        questions.add(new Question("¿Cuál es la función principal de un módulo?",
                new String[]{"Encapsular una tarea específica del programa", "Generar errores", "Definir variables globales", "Implementar bucles"},
                0));
        questions.add(new Question("¿Qué es la encapsulación en la programación modular?",
                new String[]{"La declaración de variables globales", "La ocultación de los detalles de implementación de un módulo", "La implementación de interfaces", "El uso de constantes"},
                1));
        questions.add(new Question("¿Qué es una interfaz en la programación modular?",
                new String[]{"Un tipo de bucle", "Una variable global", "Un conjunto de métodos que un módulo debe implementar", "Un tipo de constante"},
                2));
        questions.add(new Question("¿Qué es un procedimiento en la programación modular?",
                new String[]{"Una secuencia de instrucciones que realizan una tarea específica", "Una variable global", "Un tipo de bucle", "Un tipo de constante"},
                0));
        questions.add(new Question("¿Qué es una función en la programación modular?",
                new String[]{"Una variable global", "Un tipo de bucle", "Un tipo de constante", "Un bloque de código que realiza una tarea y devuelve un valor"},
                3));
        questions.add(new Question("¿Cuál es la diferencia entre una función y un procedimiento?",
                new String[]{"Un procedimiento devuelve un valor, una función no", "Una función devuelve un valor, un procedimiento no", "Ambos son lo mismo", "Ninguna de las anteriores"},
                1));
        questions.add(new Question("¿Qué es una librería en la programación modular?",
                new String[]{"Una constante", "Un conjunto de módulos reutilizables", "Un bucle específico", "Un tipo de variable"},
                1));
        questions.add(new Question("¿Qué técnica se utiliza en el análisis descendente?",
                new String[]{"Bottom-up", "Top-down", "Left-right", "Right-left"},
                1));
        questions.add(new Question("¿Qué muestra el siguiente código: public static int suma(int x, int y) { return x + y; } public static void Main() { int a = 10; int b = 5; Console.WriteLine(suma(a, b)); }",
                new String[]{"10", "5", "Error de compilación", "15"},
                3));
        questions.add(new Question("¿Qué muestra el siguiente código: static void Main() { int a = 10; int b = 5; Console.WriteLine(suma(a, b)); } static int suma(int x, int y) { return x + y; }",
                new String[]{"15", "10", "5", "Error de compilación"},
                0));
        questions.add(new Question("¿Qué muestra el siguiente código: public static void Main() { int a = 10; int b = 5; Console.WriteLine(suma(a, b)); } public static int suma(int x, int y) { return x + y; }",
                new String[]{"15", "10", "5", "Error de compilación"},
                0));
        questions.add(new Question("¿Qué muestra el siguiente código: public static void Main() { int a = 10; int b = 5; Console.WriteLine(a + b); }",
                new String[]{"Error de compilación", "5", "10", "15"},
                3));
        questions.add(new Question("¿Qué es la modularidad?",
                new String[]{"Uso de bucles y condiciones", "Dividir el programa en módulos más pequeños y manejables", "Definición de variables globales", "Uso de funciones recursivas"},
                1));
        questions.add(new Question("¿Qué es un módulo?",
                new String[]{"Un tipo de variable", "Una parte del código que se encarga de una función específica", "Una constante", "Un tipo de bucle"},
                1));
        questions.add(new Question("¿Qué es un procedimiento?",
                new String[]{"Una secuencia de instrucciones que realizan una tarea específica", "Una variable global", "Un tipo de bucle", "Un tipo de constante"},
                0));
        questions.add(new Question("¿Cuál es la diferencia entre un procedimiento y una función?",
                new String[]{"Un procedimiento devuelve un valor, una función no", "Una función devuelve un valor, un procedimiento no", "Ambos son lo mismo", "Ninguna de las anteriores"},
                1));
        questions.add(new Question("¿Qué es una librería?",
                new String[]{"Una constante", "Un conjunto de módulos reutilizables", "Un bucle específico", "Un tipo de variable"},
                1));
        questions.add(new Question("¿Cuál es la ventaja de la programación modular?",
                new String[]{"Aumenta el tamaño del código", "Hace el código más difícil de entender", "Facilita la reutilización del código", "Reduce la flexibilidad del código"},
                2));
        questions.add(new Question("¿Qué es una interfaz?",
                new String[]{"Un tipo de bucle", "Una variable global", "Un conjunto de métodos que un módulo debe implementar", "Un tipo de constante"},
                2));
        questions.add(new Question("¿Qué es la encapsulación?",
                new String[]{"El uso de constantes", "La ocultación de los detalles de implementación de un módulo", "La declaración de variables globales", "La implementación de interfaces"},
                1));
        questions.add(new Question("¿Qué palabra clave se utiliza para definir un módulo?",
                new String[]{"begin", "module", "function", "def"},
                1));
        questions.add(new Question("¿Cuál es la función principal de un módulo?",
                new String[]{"Encapsular una tarea específica del programa", "Generar errores", "Definir variables globales", "Implementar bucles"},
                0));
        questions.add(new Question("¿Qué es la programación modular?",
                new String[]{"Uso de bucles y condiciones", "Una técnica que divide el programa en módulos más pequeños y manejables", "Definición de variables globales", "Uso de funciones recursivas"},
                1));
        questions.add(new Question("¿Qué es un procedimiento en la programación modular?",
                new String[]{"Una secuencia de instrucciones que realizan una tarea específica", "Una variable global", "Un tipo de bucle", "Un tipo de constante"},
                0));
        questions.add(new Question("¿Qué es una función en la programación modular?",
                new String[]{"Un bloque de código que realiza una tarea y devuelve un valor", "Una variable global", "Un tipo de bucle", "Un tipo de constante"},
                0));
        questions.add(new Question("¿Qué técnica se utiliza en el análisis descendente?",
                new String[]{"Bottom-up", "Top-down", "Left-right", "Right-left"},
                1));
        questions.add(new Question("¿Qué es una variable local?",
                new String[]{"Una variable definida fuera de cualquier función o procedimiento", "Una variable que solo se puede usar dentro del módulo en el que fue definida", "Una variable que se puede usar en cualquier parte del programa", "Una variable que siempre tiene el mismo valor"},
                1));
        questions.add(new Question("¿Qué es una variable global?",
                new String[]{"Una variable que solo se puede usar dentro del módulo en el que fue definida", "Una variable que siempre tiene el mismo valor", "Una variable definida fuera de cualquier función o procedimiento", "Una variable que solo se puede usar dentro de una función específica"},
                2));
        questions.add(new Question("¿Qué es un módulo reutilizable?",
                new String[]{"Un módulo que solo se puede usar una vez", "Un módulo que se puede usar en diferentes programas sin modificación", "Un módulo que no se puede modificar después de ser usado", "Un módulo que se usa para depurar programas"},
                1));
        questions.add(new Question("¿Cuál es la ventaja de usar variables locales?",
                new String[]{"Aumentan la complejidad del código", "Facilitan la depuración y mantenimiento del código", "Hacen el código más difícil de entender", "Aumentan el riesgo de errores"},
                1));
        questions.add(new Question("¿Qué es un parámetro en una función?",
                new String[]{"Una constante dentro de la función", "Una variable global", "Una variable que recibe un valor cuando la función es llamada", "Un bucle dentro de la función"},
                2));
        questions.add(new Question("¿Qué es un valor de retorno en una función?",
                new String[]{"El valor que la función devuelve después de su ejecución", "Una variable global", "Una constante dentro de la función", "Un bucle dentro de la función"},
                0));
        questions.add(new Question("¿Cuál es la diferencia entre una variable local y una variable global?",
                new String[]{"Las variables locales se definen fuera de cualquier función, mientras que las variables globales se definen dentro de funciones", "Las variables globales se pueden usar en cualquier parte del programa, mientras que las variables locales solo se pueden usar dentro del módulo en el que fueron definidas", "No hay diferencia", "Las variables locales siempre tienen el mismo valor"},
                1));
        questions.add(new Question("¿Qué es un bucle en programación?",
                new String[]{"Una estructura que permite repetir un bloque de código varias veces", "Una variable global", "Una constante", "Un tipo de módulo"},
                0));
        questions.add(new Question("¿Qué palabra clave se utiliza para definir un bucle en muchos lenguajes de programación?",
                new String[]{"loop", "for", "repeat", "do"},
                1));
        questions.add(new Question("¿Cuál es la diferencia entre un bucle for y un bucle while?",
                new String[]{"Un bucle for se utiliza para repetir un bloque de código un número específico de veces, mientras que un bucle while se utiliza para repetir un bloque de código mientras se cumpla una condición", "No hay diferencia", "Un bucle while se utiliza para repetir un bloque de código un número específico de veces, mientras que un bucle for se utiliza para repetir un bloque de código mientras se cumpla una condición", "Un bucle for se utiliza solo para iterar sobre colecciones, mientras que un bucle while se utiliza para cualquier propósito"},
                0));
        questions.add(new Question("¿Qué es una condición en programación?",
                new String[]{"Una variable global", "Una constante", "Una expresión que puede ser verdadera o falsa", "Un bucle"},
                2));
        questions.add(new Question("¿Qué palabra clave se utiliza para definir una condición en muchos lenguajes de programación?",
                new String[]{"if", "cond", "test", "check"},
                0));
        questions.add(new Question("¿Qué es una estructura de control de flujo?",
                new String[]{"Una variable global", "Una constante", "Una estructura que permite controlar el flujo de ejecución del programa", "Un bucle"},
                2));
        questions.add(new Question("¿Qué es una función recursiva?",
                new String[]{"Una función que llama a otras funciones", "Una función que se llama a sí misma", "Una función que no tiene parámetros", "Una función que no devuelve ningún valor"},
                1));
        questions.add(new Question("¿Cuál es la ventaja de usar funciones recursivas?",
                new String[]{"Facilitan la comprensión del código", "Reducen el tamaño del código", "Hacen el código más complejo", "Aumentan el rendimiento del programa"},
                1));
        questions.add(new Question("¿Qué es una excepción en programación?",
                new String[]{"Un bucle", "Una variable global", "Un evento que ocurre durante la ejecución de un programa y que interrumpe el flujo normal de las instrucciones", "Una constante"},
                2));
        questions.add(new Question("¿Qué palabra clave se utiliza para manejar excepciones en muchos lenguajes de programación?",
                new String[]{"handle", "try", "catch", "except"},
                2));
        questions.add(new Question("¿Qué es un depurador?",
                new String[]{"Una herramienta que permite encontrar y corregir errores en el código", "Una variable global", "Una constante", "Un bucle"},
                0));
        questions.add(new Question("¿Qué es una prueba unitaria?",
                new String[]{"Una prueba que se realiza al sistema completo", "Una prueba que se realiza a una unidad o componente específico del código", "Una prueba que se realiza solo al código de interfaz de usuario", "Una prueba que se realiza a la base de datos"},
                1));
        questions.add(new Question("¿Qué es la documentación del código?",
                new String[]{"Un conjunto de comentarios y notas que explican cómo funciona el código", "Una variable global", "Una constante", "Un bucle"},
                0));
        questions.add(new Question("¿Qué es un algoritmo?",
                new String[]{"Una variable global", "Una constante", "Un conjunto de instrucciones bien definidas que resuelven un problema", "Un bucle"},
                2));
        questions.add(new Question("¿Qué es la complejidad temporal de un algoritmo?",
                new String[]{"El tiempo que tarda un algoritmo en ejecutarse", "La cantidad de memoria que utiliza un algoritmo", "La dificultad de entender el algoritmo", "El número de líneas de código del algoritmo"},
                0));
        questions.add(new Question("¿Qué es la complejidad espacial de un algoritmo?",
                new String[]{"El tiempo que tarda un algoritmo en ejecutarse", "La cantidad de memoria que utiliza un algoritmo", "La dificultad de entender el algoritmo", "El número de líneas de código del algoritmo"},
                1));
        questions.add(new Question("¿Qué es la recursión en programación?",
                new String[]{"Una técnica en la que una función se llama a sí misma", "Una técnica para definir variables globales", "Un tipo de bucle", "Una técnica para manejar excepciones"},
                0));
        questions.add(new Question("¿Qué es un caso base en recursión?",
                new String[]{"El caso más sencillo que puede resolver una función recursiva y que no requiere una llamada recursiva", "El primer caso que se resuelve en una función recursiva", "El último caso que se resuelve en una función recursiva", "Un caso que nunca se resuelve en una función recursiva"},
                0));
        questions.add(new Question("¿Qué es un caso recursivo?",
                new String[]{"El caso más sencillo que puede resolver una función recursiva y que no requiere una llamada recursiva", "El primer caso que se resuelve en una función recursiva", "El último caso que se resuelve en una función recursiva", "El caso en una función recursiva que requiere una llamada a sí misma"},
                3));
        questions.add(new Question("¿Cuál es la ventaja de usar recursión?",
                new String[]{"Facilita la comprensión del código", "Reduce el tamaño del código", "Hace el código más complejo", "Aumenta el rendimiento del programa"},
                1));
        questions.add(new Question("¿Qué es la programación estructurada?",
                new String[]{"Una técnica que divide el programa en módulos más pequeños y manejables", "Una técnica que organiza el código en funciones y procedimientos", "Una técnica que utiliza bucles y condiciones", "Una técnica que define variables globales"},
                1));
        questions.add(new Question("¿Cuál es la diferencia entre programación estructurada y programación modular?",
                new String[]{"No hay diferencia", "La programación estructurada organiza el código en funciones y procedimientos, mientras que la programación modular divide el programa en módulos más pequeños y manejables", "La programación modular organiza el código en funciones y procedimientos, mientras que la programación estructurada divide el programa en módulos más pequeños y manejables", "La programación estructurada utiliza bucles y condiciones, mientras que la programación modular no"},
                1));
        questions.add(new Question("¿Qué es un diagrama de flujo?",
                new String[]{"Una representación gráfica de un algoritmo o proceso", "Un conjunto de instrucciones bien definidas que resuelven un problema", "Una técnica para definir variables globales", "Una técnica para manejar excepciones"},
                0));
        questions.add(new Question("¿Qué símbolo se utiliza para representar una decisión en un diagrama de flujo?",
                new String[]{"Un rectángulo", "Un rombo", "Un círculo", "Un triángulo"},
                1));
        questions.add(new Question("¿Qué símbolo se utiliza para representar un proceso en un diagrama de flujo?",
                new String[]{"Un rectángulo", "Un rombo", "Un círculo", "Un triángulo"},
                0));
        questions.add(new Question("¿Qué es la prueba de caja negra?",
                new String[]{"Una técnica de prueba que se centra en la estructura interna del código", "Una técnica de prueba que se centra en las entradas y salidas del sistema sin considerar su estructura interna", "Una técnica de prueba que se realiza solo al código de interfaz de usuario", "Una técnica de prueba que se realiza a la base de datos"},
                1));
        questions.add(new Question("¿Qué es la prueba de caja blanca?",
                new String[]{"Una técnica de prueba que se centra en las entradas y salidas del sistema sin considerar su estructura interna", "Una técnica de prueba que se realiza solo al código de interfaz de usuario", "Una técnica de prueba que se realiza a la base de datos", "Una técnica de prueba que se centra en la estructura interna del código"},
                3));
        questions.add(new Question("¿Qué es la prueba de integración?",
                new String[]{"Una prueba que se realiza a una unidad o componente específico del código", "Una prueba que se realiza al sistema completo", "Una prueba que se realiza para verificar la interacción entre diferentes módulos del sistema", "Una prueba que se realiza solo al código de interfaz de usuario"},
                2));
        questions.add(new Question("¿Qué es la prueba de sistema?",
                new String[]{"Una prueba que se realiza a una unidad o componente específico del código", "Una prueba que se realiza al sistema completo", "Una prueba que se realiza para verificar la interacción entre diferentes módulos del sistema", "Una prueba que se realiza solo al código de interfaz de usuario"},
                1));
        questions.add(new Question("¿Qué es la prueba de aceptación?",
                new String[]{"Una prueba que se realiza para verificar que el sistema cumple con los requisitos del cliente", "Una prueba que se realiza a una unidad o componente específico del código", "Una prueba que se realiza para verificar la interacción entre diferentes módulos del sistema", "Una prueba que se realiza solo al código de interfaz de usuario"},
                0));
        questions.add(new Question("¿Qué es la prueba de regresión?",
                new String[]{"Una prueba que se realiza para verificar que los cambios en el código no han introducido nuevos errores", "Una prueba que se realiza a una unidad o componente específico del código", "Una prueba que se realiza al sistema completo", "Una prueba que se realiza solo al código de interfaz de usuario"},
                0));
        questions.add(new Question("¿Qué es un plan de pruebas?",
                new String[]{"Un conjunto de comentarios y notas que explican cómo funciona el código", "Una herramienta que permite encontrar y corregir errores en el código", "Un conjunto de instrucciones bien definidas que resuelven un problema", "Un documento que describe el alcance, enfoque, recursos y calendario de las actividades de prueba"},
                3));
        questions.add(new Question("¿Qué es un caso de prueba?",
                new String[]{"Una prueba que se realiza para verificar que el sistema cumple con los requisitos del cliente", "Una técnica de prueba que se realiza solo al código de interfaz de usuario", "Una técnica de prueba que se centra en las entradas y salidas del sistema sin considerar su estructura interna", "Un conjunto de condiciones bajo las cuales se determinará si una aplicación, sistema o una de sus características está funcionando según lo previsto"},
                3));
        questions.add(new Question("¿Qué es un entorno de prueba?",
                new String[]{"El conjunto de condiciones bajo las cuales se determinará si una aplicación, sistema o una de sus características está funcionando según lo previsto", "Una herramienta que permite encontrar y corregir errores en el código", "La combinación de hardware y software en la que se ejecutan las pruebas", "Un conjunto de instrucciones bien definidas que resuelven un problema"},
                2));
        questions.add(new Question("¿Qué es la cobertura de código?",
                new String[]{"La cantidad de código que se ha ejecutado en una prueba", "El conjunto de condiciones bajo las cuales se determinará si una aplicación, sistema o una de sus características está funcionando según lo previsto", "Un conjunto de instrucciones bien definidas que resuelven un problema", "La combinación de hardware y software en la que se ejecutan las pruebas"},
                0));
        questions.add(new Question("¿Qué es la depuración?",
                new String[]{"El proceso de encontrar y corregir errores en el código", "El proceso de definir variables globales", "El proceso de ejecutar un conjunto de instrucciones bien definidas", "El proceso de manejar excepciones"},
                0));
        questions.add(new Question("¿Qué es un error de lógica?",
                new String[]{"Un error que ocurre cuando el programa no puede encontrar una variable", "Un error que ocurre cuando el programa no puede encontrar un archivo", "Un error que ocurre cuando el programa se ejecuta pero no produce el resultado esperado", "Un error que ocurre cuando el programa no puede encontrar una función"},
                2));
        questions.add(new Question("¿Qué es un error de sintaxis?",
                new String[]{"Un error que ocurre cuando el programa se ejecuta pero no produce el resultado esperado", "Un error que ocurre cuando el programa no puede encontrar una variable", "Un error que ocurre cuando el código fuente no sigue las reglas del lenguaje de programación", "Un error que ocurre cuando el programa no puede encontrar un archivo"},
                2));
        questions.add(new Question("¿Qué es un error de tiempo de ejecución?",
                new String[]{"Un error que ocurre cuando el código fuente no sigue las reglas del lenguaje de programación", "Un error que ocurre cuando el programa no puede encontrar una variable", "Un error que ocurre cuando el programa se ejecuta pero no produce el resultado esperado", "Un error que ocurre mientras se está ejecutando el programa"},
                3));
        questions.add(new Question("¿Qué es un compilador?",
                new String[]{"Una herramienta que traduce el código fuente a código máquina", "Una herramienta que encuentra y corrige errores en el código", "Una herramienta que ejecuta el código fuente", "Una herramienta que maneja excepciones"},
                0));
        questions.add(new Question("¿Qué es un intérprete?",
                new String[]{"Una herramienta que traduce el código fuente a código máquina", "Una herramienta que encuentra y corrige errores en el código", "Una herramienta que ejecuta el código fuente línea por línea", "Una herramienta que maneja excepciones"},
                2));
        questions.add(new Question("¿Qué es un sistema de control de versiones?",
                new String[]{"Un conjunto de instrucciones bien definidas que resuelven un problema", "Una técnica para manejar excepciones", "Una herramienta que permite realizar un seguimiento de los cambios en el código fuente a lo largo del tiempo", "Una técnica para definir variables globales"},
                2));
        questions.add(new Question("¿Qué es un repositorio?",
                new String[]{"Una técnica para definir variables globales", "Una técnica para manejar excepciones", "Un conjunto de instrucciones bien definidas que resuelven un problema", "Un lugar centralizado donde se almacena y gestiona el código fuente"},
                3));
        questions.add(new Question("¿Qué es una rama en un sistema de control de versiones?",
                new String[]{"Una técnica para definir variables globales", "Una copia del código fuente que se puede modificar de forma independiente del código principal", "Un conjunto de instrucciones bien definidas que resuelven un problema", "Una técnica para manejar excepciones"},
                1));
        questions.add(new Question("¿Qué es una fusión en un sistema de control de versiones?",
                new String[]{"Una técnica para manejar excepciones", "Una técnica para definir variables globales", "El proceso de combinar los cambios de una rama con otra", "Un conjunto de instrucciones bien definidas que resuelven un problema"},
                2));
        questions.add(new Question("¿Qué es una confirmación en un sistema de control de versiones?",
                new String[]{"Una técnica para definir variables globales", "Una técnica para manejar excepciones", "El proceso de guardar los cambios en el repositorio", "Un conjunto de instrucciones bien definidas que resuelven un problema"},
                2));
        questions.add(new Question("¿Qué es un conflicto en un sistema de control de versiones?",
                new String[]{"Un conjunto de instrucciones bien definidas que resuelven un problema", "Una técnica para manejar excepciones", "Una situación en la que dos o más cambios en el código fuente son incompatibles entre sí", "Una técnica para definir variables globales"},
                2));
        questions.add(new Question("¿Qué es una revisión de código?",
                new String[]{"Un conjunto de instrucciones bien definidas que resuelven un problema", "Una técnica para manejar excepciones", "El proceso de examinar el código fuente para encontrar y corregir errores", "Una técnica para definir variables globales"},
                2));
        questions.add(new Question("¿Qué es la documentación del código?",
                new String[]{"Un conjunto de instrucciones bien definidas que resuelven un problema", "Un conjunto de comentarios y notas que explican cómo funciona el código", "Una técnica para manejar excepciones", "Una técnica para definir variables globales"},
                1));
        questions.add(new Question("¿Qué es una variable booleana?",
                new String[]{"Una variable que solo puede tener dos valores: verdadero o falso", "Una variable que almacena números enteros", "Una variable que almacena cadenas de texto", "Una variable que almacena números decimales"},
                0));

    }

    private static void addProgramacionBQuestions(List<Question> questions) {
        questions.add(new Question("¿Qué es la programación orientada a objetos (POO)?",
                new String[]{"Una forma de organizar el código basada en objetos", "Un tipo de variable", "Un método de compilación", "Una técnica de depuración"},
                0));
        questions.add(new Question("¿Qué es un objeto en POO?",
                new String[]{"Una instancia de una clase", "Una función", "Un tipo de dato", "Una variable global"},
                0));
        questions.add(new Question("¿Qué es una clase en POO?",
                new String[]{"Una librería de métodos", "Un tipo de dato primitivo", "Una función", "Un molde o plantilla para crear objetos"},
                3));
        questions.add(new Question("¿Qué es la encapsulación?",
                new String[]{"Una técnica de diseño", "Ocultar los detalles internos de un objeto", "Un método de programación", "Una forma de compilación"},
                1));
        questions.add(new Question("¿Qué es la herencia en POO?",
                new String[]{"Una técnica de depuración", "Una técnica de diseño", "El mecanismo por el cual una clase puede heredar características de otra", "Un método de compilación"},
                2));
        questions.add(new Question("¿Qué es el polimorfismo?",
                new String[]{"Una técnica de diseño", "Una variable global", "Un tipo de dato", "La capacidad de un objeto para tomar múltiples formas"},
                3));
        questions.add(new Question("¿Qué es un método en POO?",
                new String[]{"Una instancia de una clase", "Una variable global", "Una función definida dentro de una clase", "Un tipo de dato"},
                2));
        questions.add(new Question("¿Qué es un constructor?",
                new String[]{"Un tipo de dato primitivo", "Una técnica de depuración", "Una función especial utilizada para crear objetos", "Una librería de métodos"},
                2));
        questions.add(new Question("¿Qué es un destructor?",
                new String[]{"Una función especial utilizada para destruir objetos", "Una técnica de diseño", "Un método de compilación", "Un tipo de variable"},
                0));
        questions.add(new Question("¿Qué es una interfaz?",
                new String[]{"Un conjunto de métodos que una clase debe implementar", "Un tipo de dato", "Una variable global", "Una función"},
                0));
        questions.add(new Question("¿Qué es la sobrecarga de métodos?",
                new String[]{"Un tipo de dato primitivo", "Una variable global", "Una técnica de depuración", "Definir varios métodos con el mismo nombre pero diferentes parámetros"},
                3));
        questions.add(new Question("¿Qué es la sobrescritura de métodos?",
                new String[]{"Un tipo de dato", "Modificar la implementación de un método heredado", "Una técnica de diseño", "Una instancia de una clase"},
                1));
        questions.add(new Question("¿Qué es un atributo?",
                new String[]{"Una función", "Una técnica de depuración", "Un tipo de dato primitivo", "Una característica o propiedad de un objeto"},
                3));
        questions.add(new Question("¿Qué es la modularidad en POO?",
                new String[]{"Un tipo de variable", "Una técnica de diseño", "Una forma de compilación", "Dividir el programa en módulos o partes independientes"},
                3));
        questions.add(new Question("¿Qué es un paquete en Java?",
                new String[]{"Una instancia de una clase", "Un contenedor que agrupa clases relacionadas", "Un tipo de dato primitivo", "Una librería de métodos"},
                1));
        questions.add(new Question("¿Qué es el JDK?",
                new String[]{"Un tipo de variable", "Java Development Kit, un conjunto de herramientas para desarrollar en Java", "Una técnica de depuración", "Un método de compilación"},
                1));
        questions.add(new Question("¿Qué es el bytecode en Java?",
                new String[]{"Una instancia de una clase", "Una librería de métodos", "Un tipo de dato primitivo", "El código intermedio que genera el compilador de Java"},
                3));
        questions.add(new Question("¿Qué es la JVM?",
                new String[]{"Un tipo de variable", "Una técnica de diseño", "Java Virtual Machine, la máquina virtual que ejecuta el bytecode", "Un método de compilación"},
                2));
        questions.add(new Question("¿Qué es la recolección de basura en Java?",
                new String[]{"El proceso de liberar memoria automáticamente", "Una técnica de depuración", "Un tipo de dato", "Una variable global"},
                0));
        questions.add(new Question("¿Qué es una variable de instancia?",
                new String[]{"Una función", "Una variable que pertenece a una instancia de una clase", "Un tipo de dato primitivo", "Una técnica de diseño"},
                1));
        questions.add(new Question("¿Qué es una variable de clase?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase", "Una variable que pertenece a la clase y no a ninguna instancia"},
                3));
        questions.add(new Question("¿Qué es un método estático?",
                new String[]{"Una variable global", "Una técnica de diseño", "Un método que pertenece a la clase y no a ninguna instancia", "Un método de compilación"},
                2));
        questions.add(new Question("¿Qué es un método abstracto?",
                new String[]{"Un método que no tiene implementación en la clase base", "Una técnica de depuración", "Un tipo de dato", "Una variable global"},
                0));
        questions.add(new Question("¿Qué es una clase abstracta?",
                new String[]{"Una instancia de una clase", "Una clase que no puede instanciarse y puede contener métodos abstractos", "Un tipo de dato primitivo", "Una técnica de diseño"},
                1));
        questions.add(new Question("¿Qué es una clase final?",
                new String[]{"Una clase que no puede ser heredada", "Un tipo de variable", "Una técnica de depuración", "Un método de compilación"},
                0));
        questions.add(new Question("¿Qué es un método final?",
                new String[]{"Un método que no puede ser sobrescrito", "Una técnica de diseño", "Un tipo de dato", "Una instancia de una clase"},
                0));
        questions.add(new Question("¿Qué es una excepción?",
                new String[]{"Un evento que ocurre durante la ejecución del programa y altera su flujo normal", "Una función", "Un tipo de dato primitivo", "Una técnica de depuración"},
                0));
        questions.add(new Question("¿Qué es una excepción comprobada?",
                new String[]{"Un tipo de variable", "Una técnica de diseño", "Un método de compilación", "Una excepción que debe ser manejada o declarada en el método"},
                3));
        questions.add(new Question("¿Qué es una excepción no comprobada?",
                new String[]{"Una excepción que no es obligatorio manejar o declarar", "Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase"},
                0));
        questions.add(new Question("¿Qué es un bloque try-catch?",
                new String[]{"Una función", "Una técnica de diseño", "Una estructura para manejar excepciones", "Un tipo de dato primitivo"},
                2));
        questions.add(new Question("¿Qué es un bloque finally?",
                new String[]{"Un tipo de variable", "Un bloque que se ejecuta siempre después del try-catch", "Una técnica de diseño", "Un método de compilación"},
                1));
        questions.add(new Question("¿Qué es un flujo de datos?",
                new String[]{"Una función", "Una instancia de una clase", "Un tipo de dato primitivo", "Una secuencia de datos que puede ser leída o escrita"},
                3));
        questions.add(new Question("¿Qué es un flujo de bytes?",
                new String[]{"Una técnica de diseño", "Un flujo que maneja datos en forma de bytes", "Un tipo de variable", "Un método de compilación"},
                1));
        questions.add(new Question("¿Qué es un flujo de caracteres?",
                new String[]{"Una función", "Un tipo de dato primitivo", "Una técnica de depuración", "Un flujo que maneja datos en forma de caracteres"},
                3));
        questions.add(new Question("¿Qué es un archivo?",
                new String[]{"Un conjunto de datos almacenados en un dispositivo de almacenamiento", "Un tipo de variable", "Una técnica de diseño", "Un método de compilación"},
                0));
        questions.add(new Question("¿Qué es un archivo de texto?",
                new String[]{"Una instancia de una clase", "Un archivo que contiene datos en formato de texto", "Un tipo de dato primitivo", "Una librería de métodos"},
                1));
        questions.add(new Question("¿Qué es un archivo binario?",
                new String[]{"Un archivo que contiene datos en formato binario", "Una técnica de depuración", "Un tipo de variable", "Un método de compilación"},
                0));
        questions.add(new Question("¿Qué es la serialización?",
                new String[]{"El proceso de convertir un objeto en una secuencia de bytes", "Una función", "Un tipo de dato primitivo", "Una técnica de diseño"},
                0));
        questions.add(new Question("¿Qué es la deserialización?",
                new String[]{"Una técnica de depuración", "El proceso de convertir una secuencia de bytes en un objeto", "Un tipo de variable", "Un método de compilación"},
                1));
        questions.add(new Question("¿Qué es una base de datos?",
                new String[]{"Una instancia de una clase", "Un conjunto organizado de datos", "Un tipo de dato primitivo", "Una librería de métodos"},
                1));
        questions.add(new Question("¿Qué es una tabla en una base de datos?",
                new String[]{"Un tipo de dato primitivo", "Un conjunto de filas y columnas que almacenan datos", "Una técnica de depuración", "Una variable global"},
                1));
        questions.add(new Question("¿Qué es una clave primaria?",
                new String[]{"Un identificador único para cada registro en una tabla", "Una función", "Un tipo de dato", "Una variable global"},
                0));
        questions.add(new Question("¿Qué es una clave foránea?",
                new String[]{"Una técnica de diseño", "Un campo en una tabla que es clave primaria en otra tabla", "Un tipo de dato", "Una instancia de una clase"},
                1));
        questions.add(new Question("¿Qué es SQL?",
                new String[]{"Un lenguaje de programación", "Un sistema operativo", "Un lenguaje de consulta para gestionar bases de datos", "Una técnica de depuración"},
                2));
        questions.add(new Question("¿Qué es un JOIN en SQL?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una técnica de depuración", "Una operación para combinar filas de dos o más tablas"},
                3));
        questions.add(new Question("¿Qué es una vista en una base de datos?",
                new String[]{"Una tabla temporal", "Una consulta almacenada que se puede tratar como una tabla", "Una técnica de diseño", "Un tipo de variable"},
                1));
        questions.add(new Question("¿Qué es un índice en una base de datos?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una estructura que mejora la velocidad de las consultas", "Una variable global"},
                2));
        questions.add(new Question("¿Qué es un trigger en una base de datos?",
                new String[]{"Una técnica de diseño", "Un tipo de dato", "Un procedimiento que se ejecuta automáticamente en respuesta a ciertos eventos", "Una instancia de una clase"},
                2));
        questions.add(new Question("¿Qué es una transacción en una base de datos?",
                new String[]{"Una técnica de depuración", "Una secuencia de operaciones que se ejecutan como una unidad", "Un tipo de dato", "Una variable global"},
                1));
        questions.add(new Question("¿Qué es ACID en el contexto de bases de datos?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una variable global", "Un conjunto de propiedades para garantizar transacciones fiables"},
                3));
        questions.add(new Question("¿Qué es un modelo entidad-relación?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase", "Un modelo para describir datos y sus relaciones"},
                3));
        questions.add(new Question("¿Qué es normalización en bases de datos?",
                new String[]{"Una técnica de diseño", "El proceso de estructurar una base de datos para reducir la redundancia", "Un tipo de dato", "Una variable global"},
                1));
        questions.add(new Question("¿Qué es denormalización?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "El proceso de introducir redundancia en una base de datos", "Una instancia de una clase"},
                2));
        questions.add(new Question("¿Qué es un sistema gestor de bases de datos (SGBD)?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una herramienta para gestionar bases de datos", "Una variable global"},
                2));
        questions.add(new Question("¿Qué es un modelo relacional?",
                new String[]{"Una técnica de depuración", "Una variable global", "Un modelo de base de datos basado en relaciones", "Un tipo de dato"},
                2));
        questions.add(new Question("¿Qué es un procedimiento almacenado?",
                new String[]{"Una función", "Un tipo de dato", "Una variable global", "Un conjunto de instrucciones SQL almacenadas en la base de datos"},
                3));
        questions.add(new Question("¿Qué es una transacción atómica?",
                new String[]{"Un tipo de dato", "Una instancia de una clase", "Una técnica de diseño", "Una transacción que se ejecuta completamente o no se ejecuta en absoluto"},
                3));
        questions.add(new Question("¿Qué es consistencia en una transacción?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una transacción que deja la base de datos en un estado válido", "Una variable global"},
                2));
        questions.add(new Question("¿Qué es aislamiento en una transacción?",
                new String[]{"Un tipo de dato", "Una instancia de una clase", "Asegurar que las transacciones no interfieran entre sí", "Una técnica de diseño"},
                2));
        questions.add(new Question("¿Qué es durabilidad en una transacción?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una variable global", "Garantizar que los cambios realizados por una transacción son permanentes"},
                3));
        questions.add(new Question("¿Qué es una conexión a base de datos?",
                new String[]{"Una instancia de una clase", "Un enlace entre una aplicación y una base de datos", "Un tipo de dato primitivo", "Una librería de métodos"},
                1));
        questions.add(new Question("¿Qué es JDBC?",
                new String[]{"Una variable global", "Un tipo de dato", "Una técnica de diseño", "Java Database Connectivity, una API para conectar aplicaciones Java con bases de datos"},
                3));
        questions.add(new Question("¿Qué es una consulta preparada?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una variable global", "Una consulta SQL que se compila y almacena en la base de datos"},
                3));
        questions.add(new Question("¿Qué es inyección SQL?",
                new String[]{"Una instancia de una clase", "Un ataque que permite ejecutar sentencias SQL arbitrarias", "Un tipo de dato primitivo", "Una librería de métodos"},
                1));
        questions.add(new Question("¿Qué es una clase genérica?",
                new String[]{"Una técnica de diseño", "Una clase que puede manejar diferentes tipos de datos", "Un tipo de dato", "Una instancia de una clase"},
                1));
        questions.add(new Question("¿Qué es un método genérico?",
                new String[]{"Un método que puede manejar diferentes tipos de datos", "Una técnica de depuración", "Un tipo de variable", "Un método de compilación"},
                0));
        questions.add(new Question("¿Qué es un wildcard en genéricos?",
                new String[]{"Un tipo de variable", "Un tipo de dato primitivo", "Una técnica de diseño", "Un símbolo que representa cualquier tipo en un contexto genérico"},
                3));
        questions.add(new Question("¿Qué es una clase anidada?",
                new String[]{"Una instancia de una clase", "Una técnica de depuración", "Una clase dentro de otra clase", "Un tipo de dato primitivo"},
                2));
        questions.add(new Question("¿Qué es una clase interna?",
                new String[]{"Una clase dentro de otra clase", "Un tipo de variable", "Una técnica de diseño", "Un método de compilación"},
                0));
        questions.add(new Question("¿Qué es una expresión lambda?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase", "Una función anónima utilizada para implementar un método definido por una interfaz funcional"},
                3));
        questions.add(new Question("¿Qué es un stream en Java?",
                new String[]{"Un tipo de dato primitivo", "Una técnica de diseño", "Una secuencia de elementos que se pueden procesar en paralelo o secuencialmente", "Una variable global"},
                2));
        questions.add(new Question("¿Qué es una interfaz funcional?",
                new String[]{"Una instancia de una clase", "Un tipo de dato primitivo", "Una interfaz con un único método abstracto", "Una librería de métodos"},
                2));
        questions.add(new Question("¿Qué es el método default en interfaces?",
                new String[]{"Un método que tiene una implementación por defecto en la interfaz", "Una técnica de depuración", "Un tipo de variable", "Un método de compilación"},
                0));
        questions.add(new Question("¿Qué es la programación concurrente?",
                new String[]{"Una técnica de diseño", "Un tipo de variable", "Un método de compilación", "La ejecución simultánea de múltiples hilos de ejecución"},
                3));
        questions.add(new Question("¿Qué es un hilo en Java?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase", "Una unidad de ejecución dentro de un proceso"},
                3));
        questions.add(new Question("¿Qué es la sincronización de hilos?",
                new String[]{"Un tipo de variable", "Una técnica para controlar el acceso a recursos compartidos entre hilos", "Una instancia de una clase", "Un método de compilación"},
                1));
        questions.add(new Question("¿Qué es un bloqueo en programación concurrente?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase", "Una herramienta para controlar el acceso concurrente a recursos compartidos"},
                3));
        questions.add(new Question("¿Qué es un deadlock?",
                new String[]{"Un tipo de variable", "Un estado en el que dos o más hilos se bloquean mutuamente esperando recursos", "Una técnica de diseño", "Un método de compilación"},
                1));
        questions.add(new Question("¿Qué es la serialización?",
                new String[]{"El proceso de convertir un objeto en una secuencia de bytes", "Una función", "Un tipo de dato primitivo", "Una técnica de diseño"},
                0));
        questions.add(new Question("¿Qué es la deserialización?",
                new String[]{"Una técnica de depuración", "El proceso de convertir una secuencia de bytes en un objeto", "Un tipo de variable", "Un método de compilación"},
                1));
        questions.add(new Question("¿Qué es una base de datos?",
                new String[]{"Una instancia de una clase", "Un conjunto organizado de datos", "Un tipo de dato primitivo", "Una librería de métodos"},
                1));
        questions.add(new Question("¿Qué es una tabla en una base de datos?",
                new String[]{"Un tipo de dato primitivo", "Un conjunto de filas y columnas que almacenan datos", "Una técnica de depuración", "Una variable global"},
                1));
        questions.add(new Question("¿Qué es una clave primaria?",
                new String[]{"Un identificador único para cada registro en una tabla", "Una función", "Un tipo de dato", "Una variable global"},
                0));
        questions.add(new Question("¿Qué es una clave foránea?",
                new String[]{"Una técnica de diseño", "Un campo en una tabla que es clave primaria en otra tabla", "Un tipo de dato", "Una instancia de una clase"},
                1));
        questions.add(new Question("¿Qué es SQL?",
                new String[]{"Un lenguaje de programación", "Un sistema operativo", "Un lenguaje de consulta para gestionar bases de datos", "Una técnica de depuración"},
                2));
        questions.add(new Question("¿Qué es un JOIN en SQL?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una técnica de depuración", "Una operación para combinar filas de dos o más tablas"},
                3));
        questions.add(new Question("¿Qué es una vista en una base de datos?",
                new String[]{"Una tabla temporal", "Una consulta almacenada que se puede tratar como una tabla", "Una técnica de diseño", "Un tipo de variable"},
                1));
        questions.add(new Question("¿Qué es un índice en una base de datos?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una estructura que mejora la velocidad de las consultas", "Una variable global"},
                2));
        questions.add(new Question("¿Qué es un trigger en una base de datos?",
                new String[]{"Una técnica de diseño", "Un tipo de dato", "Un procedimiento que se ejecuta automáticamente en respuesta a ciertos eventos", "Una instancia de una clase"},
                2));
        questions.add(new Question("¿Qué es una transacción en una base de datos?",
                new String[]{"Una técnica de depuración", "Una secuencia de operaciones que se ejecutan como una unidad", "Un tipo de dato", "Una variable global"},
                1));
        questions.add(new Question("¿Qué es ACID en el contexto de bases de datos?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una variable global", "Un conjunto de propiedades para garantizar transacciones fiables"},
                3));
        questions.add(new Question("¿Qué es un modelo entidad-relación?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase", "Un modelo para describir datos y sus relaciones"},
                3));
        questions.add(new Question("¿Qué es normalización en bases de datos?",
                new String[]{"Una técnica de diseño", "El proceso de estructurar una base de datos para reducir la redundancia", "Un tipo de dato", "Una variable global"},
                1));
        questions.add(new Question("¿Qué es denormalización?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "El proceso de introducir redundancia en una base de datos", "Una instancia de una clase"},
                2));
        questions.add(new Question("¿Qué es un sistema gestor de bases de datos (SGBD)?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una herramienta para gestionar bases de datos", "Una variable global"},
                2));
        questions.add(new Question("¿Qué es un modelo relacional?",
                new String[]{"Una técnica de depuración", "Una variable global", "Un modelo de base de datos basado en relaciones", "Un tipo de dato"},
                2));
        questions.add(new Question("¿Qué es un procedimiento almacenado?",
                new String[]{"Una función", "Un tipo de dato", "Una variable global", "Un conjunto de instrucciones SQL almacenadas en la base de datos"},
                3));
        questions.add(new Question("¿Qué es una transacción atómica?",
                new String[]{"Un tipo de dato", "Una instancia de una clase", "Una técnica de diseño", "Una transacción que se ejecuta completamente o no se ejecuta en absoluto"},
                3));
        questions.add(new Question("¿Qué es consistencia en una transacción?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una transacción que deja la base de datos en un estado válido", "Una variable global"},
                2));
        questions.add(new Question("¿Qué es aislamiento en una transacción?",
                new String[]{"Un tipo de dato", "Una instancia de una clase", "Asegurar que las transacciones no interfieran entre sí", "Una técnica de diseño"},
                2));
        questions.add(new Question("¿Qué es durabilidad en una transacción?",
                new String[]{"Un tipo de dato", "Una técnica de diseño", "Una variable global", "Garantizar que los cambios realizados por una transacción son permanentes"},
                3));
        questions.add(new Question("¿Qué es una conexión a base de datos?",
                new String[]{"Una instancia de una clase", "Un enlace entre una aplicación y una base de datos", "Un tipo de dato primitivo", "Una librería de métodos"},
                1));
        questions.add(new Question("¿Qué es JDBC?",
                new String[]{"Una variable global", "Un tipo de dato", "Una técnica de diseño", "Java Database Connectivity, una API para conectar aplicaciones Java con bases de datos"},
                3));
        questions.add(new Question("¿Qué es una consulta preparada?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una variable global", "Una consulta SQL que se compila y almacena en la base de datos"},
                3));
        questions.add(new Question("¿Qué es inyección SQL?",
                new String[]{"Una instancia de una clase", "Un ataque que permite ejecutar sentencias SQL arbitrarias", "Un tipo de dato primitivo", "Una librería de métodos"},
                1));
        questions.add(new Question("¿Qué es una clase genérica?",
                new String[]{"Una técnica de diseño", "Una clase que puede manejar diferentes tipos de datos", "Un tipo de dato", "Una instancia de una clase"},
                1));
        questions.add(new Question("¿Qué es un método genérico?",
                new String[]{"Un método que puede manejar diferentes tipos de datos", "Una técnica de depuración", "Un tipo de variable", "Un método de compilación"},
                0));
        questions.add(new Question("¿Qué es un wildcard en genéricos?",
                new String[]{"Un tipo de variable", "Un tipo de dato primitivo", "Una técnica de diseño", "Un símbolo que representa cualquier tipo en un contexto genérico"},
                3));
        questions.add(new Question("¿Qué es una clase anidada?",
                new String[]{"Una instancia de una clase", "Una técnica de depuración", "Una clase dentro de otra clase", "Un tipo de dato primitivo"},
                2));
        questions.add(new Question("¿Qué es una clase interna?",
                new String[]{"Una clase dentro de otra clase", "Un tipo de variable", "Una técnica de diseño", "Un método de compilación"},
                0));
        questions.add(new Question("¿Qué es una expresión lambda?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase", "Una función anónima utilizada para implementar un método definido por una interfaz funcional"},
                3));
        questions.add(new Question("¿Qué es un stream en Java?",
                new String[]{"Un tipo de dato primitivo", "Una técnica de diseño", "Una secuencia de elementos que se pueden procesar en paralelo o secuencialmente", "Una variable global"},
                2));
        questions.add(new Question("¿Qué es una interfaz funcional?",
                new String[]{"Una instancia de una clase", "Un tipo de dato primitivo", "Una interfaz con un único método abstracto", "Una librería de métodos"},
                2));
        questions.add(new Question("¿Qué es el método default en interfaces?",
                new String[]{"Un método que tiene una implementación por defecto en la interfaz", "Una técnica de depuración", "Un tipo de variable", "Un método de compilación"},
                0));
        questions.add(new Question("¿Qué es la programación concurrente?",
                new String[]{"Una técnica de diseño", "Un tipo de variable", "Un método de compilación", "La ejecución simultánea de múltiples hilos de ejecución"},
                3));
        questions.add(new Question("¿Qué es un hilo en Java?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase", "Una unidad de ejecución dentro de un proceso"},
                3));
        questions.add(new Question("¿Qué es la sincronización de hilos?",
                new String[]{"Un tipo de variable", "Una técnica para controlar el acceso a recursos compartidos entre hilos", "Una instancia de una clase", "Un método de compilación"},
                1));
        questions.add(new Question("¿Qué es un bloqueo en programación concurrente?",
                new String[]{"Una técnica de depuración", "Un tipo de dato", "Una instancia de una clase", "Una herramienta para controlar el acceso concurrente a recursos compartidos"},
                3));
        questions.add(new Question("¿Qué es un deadlock?",
                new String[]{"Un tipo de variable", "Un estado en el que dos o más hilos se bloquean mutuamente esperando recursos", "Una técnica de diseño", "Un método de compilación"},
                1));

    }

    private static void addLenguajeMarcasQuestions(List<Question> questions) {
        questions.add(new Question("¿Qué es un lenguaje de marcas?",
                new String[]{"Un lenguaje de programación", "Un lenguaje que utiliza etiquetas para definir la estructura de un documento", "Un lenguaje de diseño gráfico", "Un lenguaje de programación orientado a objetos"},
                1));
        questions.add(new Question("¿Qué significa la sigla XML?",
                new String[]{"Extended Markup Language", "Extraordinary Markup Language", "Extensible Markup Language", "Exotic Markup Language"},
                2));
        questions.add(new Question("¿Cuál es la función principal de una etiqueta en XML?",
                new String[]{"Agregar estilos al documento", "Crear enlaces", "Ejecutar scripts", "Definir los elementos del documento"},
                3));
        questions.add(new Question("¿Qué es un DTD en XML?",
                new String[]{"Un esquema que define la estructura y las reglas de un documento XML", "Un tipo de dato", "Una base de datos", "Una tabla de contenido"},
                0));
        questions.add(new Question("¿Para qué se utiliza la etiqueta <title> en HTML?",
                new String[]{"Para definir el título del documento", "Para definir el cuerpo del documento", "Para definir un párrafo", "Para definir una lista"},
                0));
        questions.add(new Question("¿Qué atributo en HTML se utiliza para hacer un hipervínculo?",
                new String[]{"src", "href", "link", "meta"},
                1));
        questions.add(new Question("¿Qué significa la sigla HTML?",
                new String[]{"HyperText Markup Language", "HighText Machine Language", "HyperText Module Language", "High Transfer Markup Language"},
                0));
        questions.add(new Question("¿Cuál de las siguientes etiquetas se usa para insertar una imagen en HTML?",
                new String[]{"<a>", "<img>", "<div>", "<span>"},
                1));
        questions.add(new Question("¿Qué etiqueta se utiliza para crear una lista ordenada en HTML?",
                new String[]{"<ul>", "<li>", "<ol>", "<dl>"},
                2));
        questions.add(new Question("¿Cuál es la estructura correcta de un documento HTML básico?",
                new String[]{"<html><body><head></head></body></html>", "<html><head></head><body></body></html>", "<head><html></html><body></body></head>", "<body><html></html><head></head></body>"},
                1));
        questions.add(new Question("¿Qué es un espacio de nombres en XML?",
                new String[]{"Un atributo que se utiliza para definir la codificación del documento", "Una colección de etiquetas XML con un ámbito semántico en común", "Un tipo de comentario en XML", "Un conjunto de instrucciones para el procesador XML"},
                1));
        questions.add(new Question("¿Cuál es la sintaxis correcta para un comentario en HTML?",
                new String[]{"<!-- Esto es un comentario -->", "// Esto es un comentario", "/* Esto es un comentario */", "# Esto es un comentario"},
                0));
        questions.add(new Question("¿Qué etiqueta HTML se utiliza para definir una tabla?",
                new String[]{"<table>", "<tab>", "<tr>", "<td>"},
                0));
        questions.add(new Question("¿Cuál es la función de la etiqueta <head> en HTML?",
                new String[]{"Definir el contenido visible del documento", "Definir la cabecera del documento", "Definir el pie de página del documento", "Definir un enlace"},
                1));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una lista no ordenada en HTML?",
                new String[]{"<ul>", "<li>", "<ol>", "<dl>"},
                0));
        questions.add(new Question("¿Qué atributo en la etiqueta <img> se utiliza para especificar la URL de la imagen?",
                new String[]{"alt", "href", "src", "link"},
                2));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir un párrafo en HTML?",
                new String[]{"<p>", "<div>", "<span>", "<br>"},
                0));
        questions.add(new Question("¿Cuál es el propósito de la etiqueta <meta> en HTML?",
                new String[]{"Definir metadatos sobre el documento", "Definir un enlace", "Definir un script", "Definir una imagen"},
                0));
        questions.add(new Question("¿Qué es XHTML?",
                new String[]{"Una extensión de HTML que utiliza la sintaxis de XML", "Un lenguaje de programación", "Un lenguaje de diseño gráfico", "Una hoja de estilo"},
                0));
        questions.add(new Question("¿Qué etiqueta HTML se utiliza para definir un formulario?",
                new String[]{"<form>", "<input>", "<button>", "<label>"},
                0));
        questions.add(new Question("¿Cuál es el propósito de la etiqueta <link> en HTML?",
                new String[]{"Definir un enlace a un recurso externo", "Definir un enlace interno", "Definir una imagen", "Definir un script"},
                0));
        questions.add(new Question("¿Qué es un esquema en XML?",
                new String[]{"Un documento que define la estructura y los tipos de datos de un documento XML", "Un tipo de comentario en XML", "Una colección de etiquetas XML con un ámbito semántico en común", "Un atributo que se utiliza para definir la codificación del documento"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una celda en una tabla HTML?",
                new String[]{"<tr>", "<td>", "<th>", "<table>"},
                1));
        questions.add(new Question("¿Qué atributo se utiliza para especificar el texto alternativo de una imagen en HTML?",
                new String[]{"src", "alt", "href", "title"},
                1));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una sección en HTML5?",
                new String[]{"<div>", "<section>", "<header>", "<article>"},
                1));
        questions.add(new Question("¿Qué es un nodo en XML?",
                new String[]{"Un elemento básico de la estructura de un documento XML", "Un tipo de atributo en XML", "Un comentario en XML", "Una instrucción de procesamiento en XML"},
                0));
        questions.add(new Question("¿Qué significa CSS?",
                new String[]{"Cascading Style Sheets", "Creative Style Sheets", "Computer Style Sheets", "Colorful Style Sheets"},
                0));
        questions.add(new Question("¿Cuál es la función de la etiqueta <br> en HTML?",
                new String[]{"Crear un enlace", "Insertar una imagen", "Insertar un salto de línea", "Definir un párrafo"},
                2));
        questions.add(new Question("¿Qué atributo en HTML se utiliza para especificar el destino de un enlace?",
                new String[]{"href", "src", "target", "link"},
                2));
        questions.add(new Question("¿Qué es un documento XML bien formado?",
                new String[]{"Un documento que cumple con las reglas de sintaxis de XML", "Un documento que utiliza DTD", "Un documento que utiliza esquemas XML", "Un documento que contiene comentarios"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una cabecera en HTML5?",
                new String[]{"<div>", "<header>", "<section>", "<article>"},
                1));
        questions.add(new Question("¿Cuál es el propósito de la etiqueta <footer> en HTML5?",
                new String[]{"Definir el pie de página de un documento o sección", "Definir una cabecera", "Definir una sección", "Definir un artículo"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir un área navegable dentro de una imagen en HTML?",
                new String[]{"<area>", "<map>", "<img>", "<nav>"},
                0));
        questions.add(new Question("¿Cuál es la función de la etiqueta <style> en HTML?",
                new String[]{"Definir estilos CSS para un documento HTML", "Definir un script", "Definir un enlace", "Definir una imagen"},
                0));
        questions.add(new Question("¿Qué es una entidad en XML?",
                new String[]{"Un símbolo que representa un carácter especial en XML", "Una etiqueta en XML", "Un atributo en XML", "Un comentario en XML"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una lista de definiciones en HTML?",
                new String[]{"<dl>", "<ol>", "<ul>", "<li>"},
                0));
        questions.add(new Question("¿Cuál es el propósito de la etiqueta <div> en HTML?",
                new String[]{"Definir una división o sección en un documento", "Definir un párrafo", "Definir un enlace", "Definir una imagen"},
                0));
        questions.add(new Question("¿Qué atributo en HTML se utiliza para definir una clase de estilo CSS?",
                new String[]{"id", "class", "style", "src"},
                1));
        questions.add(new Question("¿Cuál es la función de la etiqueta <script> en HTML?",
                new String[]{"Definir un script", "Definir un estilo", "Definir un enlace", "Definir una imagen"},
                0));
        questions.add(new Question("¿Qué es un comentario en XML?",
                new String[]{"Una sección de texto que no es procesada por el parser XML", "Una etiqueta en XML", "Un atributo en XML", "Una entidad en XML"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una celda de encabezado en una tabla HTML?",
                new String[]{"<tr>", "<td>", "<th>", "<table>"},
                2));
        questions.add(new Question("¿Cuál es la sintaxis correcta para una declaración XML?",
                new String[]{"<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "<xml version=\"1.0\" encoding=\"UTF-8\">", "<!xml version=\"1.0\" encoding=\"UTF-8\">", "</xml version=\"1.0\" encoding=\"UTF-8\">"},
                0));
        questions.add(new Question("¿Qué es una hoja de estilo en cascada (CSS)?",
                new String[]{"Un lenguaje utilizado para describir la presentación de un documento HTML", "Un lenguaje de programación", "Un tipo de documento XML", "Un tipo de base de datos"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir un bloque de contenido en HTML?",
                new String[]{"<div>", "<span>", "<block>", "<section>"},
                0));
        questions.add(new Question("¿Cuál es el propósito de la etiqueta <a> en HTML?",
                new String[]{"Definir un enlace", "Definir un párrafo", "Definir una cabecera", "Definir una lista"},
                0));
        questions.add(new Question("¿Qué atributo en HTML se utiliza para definir un identificador único?",
                new String[]{"id", "class", "name", "src"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir un enlace en HTML?",
                new String[]{"<a>", "<link>", "<href>", "<src>"},
                0));
        questions.add(new Question("¿Cuál es la función de la etiqueta <meta> en HTML?",
                new String[]{"Definir metadatos sobre el documento", "Definir un script", "Definir una imagen", "Definir un enlace"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una cabecera en HTML5?",
                new String[]{"<header>", "<div>", "<section>", "<nav>"},
                0));
        questions.add(new Question("¿Qué es un DTD en XML?",
                new String[]{"Un esquema que define la estructura y las reglas de un documento XML", "Un tipo de dato", "Una base de datos", "Una tabla de contenido"},
                0));
        questions.add(new Question("¿Qué significa CSS?",
                new String[]{"Creative Style Sheets", "Cascading Style Sheets", "Computer Style Sheets", "Colorful Style Sheets"},
                1));
        questions.add(new Question("¿Cuál es la función de la etiqueta <br> en HTML?",
                new String[]{"Crear un enlace", "Insertar una imagen", "Definir un párrafo", "Insertar un salto de línea"},
                3));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una lista no ordenada en HTML?",
                new String[]{"<ul>", "<li>", "<ol>", "<dl>"},
                0));
        questions.add(new Question("¿Qué atributo en la etiqueta <img> se utiliza para especificar la URL de la imagen?",
                new String[]{"src", "alt", "href", "title"},
                0));
        questions.add(new Question("¿Qué es un espacio de nombres en XML?",
                new String[]{"Una colección de etiquetas XML con un ámbito semántico en común", "Un atributo que se utiliza para definir la codificación del documento", "Un tipo de comentario en XML", "Un conjunto de instrucciones para el procesador XML"},
                0));
        questions.add(new Question("¿Cuál es la sintaxis correcta para un comentario en HTML?",
                new String[]{"<!-- Esto es un comentario -->", "// Esto es un comentario", "/* Esto es un comentario */", "# Esto es un comentario"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una sección en HTML5?",
                new String[]{"<section>", "<div>", "<header>", "<article>"},
                0));
        questions.add(new Question("¿Qué es un nodo en XML?",
                new String[]{"Un elemento básico de la estructura de un documento XML", "Un tipo de atributo en XML", "Un comentario en XML", "Una instrucción de procesamiento en XML"},
                0));
        questions.add(new Question("¿Qué significa la sigla XML?",
                new String[]{"Extended Markup Language", "Exotic Markup Language", "Extraordinary Markup Language", "Extensible Markup Language"},
                3));
        questions.add(new Question("¿Cuál es la estructura correcta de un documento HTML básico?",
                new String[]{"<html><head></head><body></body></html>", "<html><body><head></head></body></html>", "<head><html></html><body></body></head>", "<body><html></html><head></head></body>"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una celda en una tabla HTML?",
                new String[]{"<tr>", "<td>", "<th>", "<table>"},
                1));
        questions.add(new Question("¿Qué atributo se utiliza para especificar el texto alternativo de una imagen en HTML?",
                new String[]{"src", "alt", "href", "title"},
                1));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una lista de definiciones en HTML?",
                new String[]{"<dl>", "<ol>", "<ul>", "<li>"},
                0));
        questions.add(new Question("¿Qué es una entidad en XML?",
                new String[]{"Un símbolo que representa un carácter especial en XML", "Una etiqueta en XML", "Un atributo en XML", "Un comentario en XML"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una tabla en HTML?",
                new String[]{"<table>", "<tab>", "<tr>", "<td>"},
                0));
        questions.add(new Question("¿Cuál es la función principal de una etiqueta en XML?",
                new String[]{"Definir los elementos del documento", "Agregar estilos al documento", "Crear enlaces", "Ejecutar scripts"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una cabecera en HTML?",
                new String[]{"<header>", "<div>", "<section>", "<nav>"},
                0));
        questions.add(new Question("¿Qué es un documento XML bien formado?",
                new String[]{"Un documento que cumple con las reglas de sintaxis de XML", "Un documento que utiliza DTD", "Un documento que utiliza esquemas XML", "Un documento que contiene comentarios"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir un formulario en HTML?",
                new String[]{"<form>", "<input>", "<button>", "<label>"},
                0));
        questions.add(new Question("¿Cuál es el propósito de la etiqueta <link> en HTML?",
                new String[]{"Definir un enlace a un recurso externo", "Definir un enlace interno", "Definir una imagen", "Definir un script"},
                0));
        questions.add(new Question("¿Qué es XHTML?",
                new String[]{"Una extensión de HTML que utiliza la sintaxis de XML", "Un lenguaje de programación", "Un lenguaje de diseño gráfico", "Una hoja de estilo"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir un bloque de contenido en HTML?",
                new String[]{"<div>", "<span>", "<block>", "<section>"},
                0));
        questions.add(new Question("¿Cuál es el propósito de la etiqueta <a> en HTML?",
                new String[]{"Definir un enlace", "Definir un párrafo", "Definir una cabecera", "Definir una lista"},
                0));
        questions.add(new Question("¿Qué atributo en HTML se utiliza para definir un identificador único?",
                new String[]{"id", "class", "name", "src"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una lista ordenada en HTML?",
                new String[]{"<ol>", "<ul>", "<li>", "<dl>"},
                0));
        questions.add(new Question("¿Cuál es la función de la etiqueta <body> en HTML?",
                new String[]{"Definir el contenido visible del documento", "Definir la cabecera del documento", "Definir un enlace", "Definir un script"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una imagen en HTML?",
                new String[]{"<img>", "<image>", "<src>", "<pic>"},
                0));
        questions.add(new Question("¿Qué atributo en HTML se utiliza para definir un destino de un enlace?",
                new String[]{"target", "href", "src", "link"},
                1));
        questions.add(new Question("¿Qué es un espacio de nombres en XML?",
                new String[]{"Una colección de etiquetas XML con un ámbito semántico en común", "Un atributo que se utiliza para definir la codificación del documento", "Un tipo de comentario en XML", "Un conjunto de instrucciones para el procesador XML"},
                0));
        questions.add(new Question("¿Cuál es la función de la etiqueta <script> en HTML?",
                new String[]{"Definir un script", "Definir un estilo", "Definir un enlace", "Definir una imagen"},
                0));
        questions.add(new Question("¿Qué es un comentario en XML?",
                new String[]{"Una sección de texto que no es procesada por el parser XML", "Una etiqueta en XML", "Un atributo en XML", "Una entidad en XML"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una celda de encabezado en una tabla HTML?",
                new String[]{"<tr>", "<td>", "<th>", "<table>"},
                2));
        questions.add(new Question("¿Cuál es la sintaxis correcta para una declaración XML?",
                new String[]{"<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "<xml version=\"1.0\" encoding=\"UTF-8\">", "<!xml version=\"1.0\" encoding=\"UTF-8\">", "</xml version=\"1.0\" encoding=\"UTF-8\">"},
                0));
        questions.add(new Question("¿Qué es una hoja de estilo en cascada (CSS)?",
                new String[]{"Un lenguaje utilizado para describir la presentación de un documento HTML", "Un lenguaje de programación", "Un tipo de documento XML", "Un tipo de base de datos"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir un enlace en HTML?",
                new String[]{"<a>", "<link>", "<href>", "<src>"},
                0));
        questions.add(new Question("¿Cuál es el propósito de la etiqueta <meta> en HTML?",
                new String[]{"Definir metadatos sobre el documento", "Definir un script", "Definir una imagen", "Definir un enlace"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una cabecera en HTML5?",
                new String[]{"<header>", "<div>", "<section>", "<nav>"},
                0));
        questions.add(new Question("¿Qué es un DTD en XML?",
                new String[]{"Un esquema que define la estructura y las reglas de un documento XML", "Un tipo de dato", "Una base de datos", "Una tabla de contenido"},
                0));
        questions.add(new Question("¿Qué significa CSS?",
                new String[]{"Creative Style Sheets", "Cascading Style Sheets", "Computer Style Sheets", "Colorful Style Sheets"},
                1));
        questions.add(new Question("¿Cuál es la función de la etiqueta <br> en HTML?",
                new String[]{"Crear un enlace", "Insertar una imagen", "Definir un párrafo", "Insertar un salto de línea"},
                3));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una lista no ordenada en HTML?",
                new String[]{"<ul>", "<li>", "<ol>", "<dl>"},
                0));
        questions.add(new Question("¿Qué atributo en la etiqueta <img> se utiliza para especificar la URL de la imagen?",
                new String[]{"src", "alt", "href", "title"},
                0));
        questions.add(new Question("¿Qué es un espacio de nombres en XML?",
                new String[]{"Una colección de etiquetas XML con un ámbito semántico en común", "Un atributo que se utiliza para definir la codificación del documento", "Un tipo de comentario en XML", "Un conjunto de instrucciones para el procesador XML"},
                0));
        questions.add(new Question("¿Cuál es la sintaxis correcta para un comentario en HTML?",
                new String[]{"<!-- Esto es un comentario -->", "// Esto es un comentario", "/* Esto es un comentario */", "# Esto es un comentario"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una sección en HTML5?",
                new String[]{"<section>", "<div>", "<header>", "<article>"},
                0));
        questions.add(new Question("¿Qué es un nodo en XML?",
                new String[]{"Un elemento básico de la estructura de un documento XML", "Un tipo de atributo en XML", "Un comentario en XML", "Una instrucción de procesamiento en XML"},
                0));
        questions.add(new Question("¿Qué significa la sigla XML?",
                new String[]{"Extended Markup Language", "Exotic Markup Language", "Extraordinary Markup Language", "Extensible Markup Language"},
                3));
        questions.add(new Question("¿Cuál es la estructura correcta de un documento HTML básico?",
                new String[]{"<html><head></head><body></body></html>", "<html><body><head></head></body></html>", "<head><html></html><body></body></head>", "<body><html></html><head></head></body>"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una celda en una tabla HTML?",
                new String[]{"<tr>", "<td>", "<th>", "<table>"},
                1));
        questions.add(new Question("¿Qué atributo se utiliza para especificar el texto alternativo de una imagen en HTML?",
                new String[]{"src", "alt", "href", "title"},
                1));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una lista de definiciones en HTML?",
                new String[]{"<dl>", "<ol>", "<ul>", "<li>"},
                0));
        questions.add(new Question("¿Qué es una entidad en XML?",
                new String[]{"Un símbolo que representa un carácter especial en XML", "Una etiqueta en XML", "Un atributo en XML", "Un comentario en XML"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una tabla en HTML?",
                new String[]{"<table>", "<tab>", "<tr>", "<td>"},
                0));
        questions.add(new Question("¿Cuál es la función principal de una etiqueta en XML?",
                new String[]{"Definir los elementos del documento", "Agregar estilos al documento", "Crear enlaces", "Ejecutar scripts"},
                0));
        questions.add(new Question("¿Qué etiqueta se utiliza para definir una cabecera en HTML?",
                new String[]{"<header>", "<div>", "<section>", "<nav>"},
                0));

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
        questions.add(new Question("¿Cuál es la principal función de un entorno de desarrollo integrado (IDE)?",
                new String[]{"Ejecutar el código fuente directamente", "Facilitar la programación con herramientas integradas", "Controlar la versión del hardware", "Proteger el código contra virus"},
                1));
        questions.add(new Question("¿Qué componente de un IDE permite la creación de interfaces gráficas?",
                new String[]{"Compilador", "Editor de texto", "Depurador", "Constructor de interfaz gráfica"},
                3));
        questions.add(new Question("¿Cuál de las siguientes opciones NO es un componente típico de un IDE?",
                new String[]{"Editor de texto", "Depurador", "Sistema operativo", "Compilador"},
                2));
        questions.add(new Question("¿Qué herramienta en un IDE se encarga de traducir el código fuente a lenguaje máquina?",
                new String[]{"Editor de texto", "Depurador", "Constructor de interfaz gráfica", "Compilador"},
                3));
        questions.add(new Question("¿Qué es un 'plugin' en el contexto de un entorno de desarrollo?",
                new String[]{"Una herramienta para diseñar interfaces", "Una extensión que agrega funcionalidad al IDE", "Una aplicación independiente", "Un tipo de compilador"},
                1));
        questions.add(new Question("¿Cuál es la ventaja principal del uso de control de versiones?",
                new String[]{"Facilitar la creación de interfaces gráficas", "Acelerar la compilación del código", "Permitir la gestión de cambios y versiones del código", "Detectar errores en tiempo de ejecución"},
                2));
        questions.add(new Question("¿Qué función realiza un depurador en un entorno de desarrollo?",
                new String[]{"Gestionar las versiones del código", "Compilar el código", "Diseñar interfaces gráficas", "Detectar y corregir errores en el código fuente"},
                3));
        questions.add(new Question("¿Qué lenguaje de programación es el enfoque principal de Eclipse IDE?",
                new String[]{"Python", "C++", "JavaScript", "Java"},
                3));
        questions.add(new Question("¿Cuál es el propósito de un intérprete en un IDE?",
                new String[]{"Gestionar versiones de código", "Diseñar interfaces gráficas", "Compilar todo el código de una vez", "Ejecutar instrucciones a medida que se traducen"},
                3));
        questions.add(new Question("¿Qué herramienta se utiliza en un IDE para manejar errores de código?",
                new String[]{"Depurador", "Constructor de interfaz gráfica", "Compilador", "Editor de texto"},
                0));
        questions.add(new Question("¿Cuál de las siguientes es una función del editor de texto en un IDE?",
                new String[]{"Escribir y editar el código fuente", "Gestionar versiones", "Detectar errores lógicos", "Compilar el código"},
                0));
        questions.add(new Question("¿Qué es el JDK en el contexto del desarrollo en Java?",
                new String[]{"Java Development Kit", "Java Deployment Kit", "Java Debugging Kit", "Java Design Kit"},
                0));
        questions.add(new Question("¿Qué plugin se menciona para el desarrollo de interfaces gráficas en Eclipse?",
                new String[]{"Swing", "JavaFX", "AWT", "GTK"},
                1));
        questions.add(new Question("¿Qué se necesita configurar al iniciar Eclipse por primera vez?",
                new String[]{"Sistema operativo", "Depurador", "Plugin de Swing", "Workspace"},
                3));
        questions.add(new Question("¿Cuál es una característica del control de versiones?",
                new String[]{"Gestionar revisiones y cambios en el código", "Detectar errores de sintaxis", "Compilar el código más rápido", "Facilitar la creación de interfaces gráficas"},
                0));
        questions.add(new Question("¿Qué permite hacer la herramienta de 'WindowBuilder' en Eclipse?",
                new String[]{"Compilar código", "Controlar versiones", "Ejecutar pruebas unitarias", "Diseñar interfaces gráficas con Swing"},
                3));
        questions.add(new Question("¿Cuál de las siguientes no es una tarea de un depurador?",
                new String[]{"Detener el programa en puntos de ruptura", "Realizar pruebas unitarias", "Examinar la ejecución del programa", "Ejecutar el programa"},
                1));
        questions.add(new Question("¿Qué es una prueba unitaria?",
                new String[]{"Una prueba del sistema completo", "Una prueba de la interfaz gráfica", "Una prueba del compilador", "Una prueba de una unidad específica del código"},
                3));
        questions.add(new Question("¿Qué framework se menciona para realizar pruebas unitarias en Java?",
                new String[]{"Mockito", "TestNG", "Selenium", "JUnit"},
                3));
        questions.add(new Question("¿Qué es una aserción en el contexto de pruebas unitarias?",
                new String[]{"Un tipo de depurador", "Un método para diseño de interfaces", "Un predicado incluido en el código para asegurar una condición", "Una herramienta de compilación"},
                2));
        questions.add(new Question("¿Cuál es una técnica de prueba que no requiere conocer la estructura interna del código?",
                new String[]{"Prueba de caja blanca", "Prueba de integración", "Prueba de caja negra", "Prueba unitaria"},
                2));
        questions.add(new Question("¿Qué tipo de prueba se centra en las entradas y salidas del sistema sin considerar su funcionamiento interno?",
                new String[]{"Prueba de caja blanca", "Prueba unitaria", "Prueba de caja negra", "Prueba de integración"},
                2));
        questions.add(new Question("¿Qué tipo de prueba se basa en el examen de los detalles procedimentales del código?",
                new String[]{"Prueba de caja negra", "Prueba funcional", "Prueba de caja blanca", "Prueba de regresión"},
                2));
        questions.add(new Question("¿Qué es una precondición en el contexto de pruebas de software?",
                new String[]{"El resultado esperado de una prueba", "Una herramienta de depuración", "Un error detectado durante la prueba", "Una condición que debe cumplirse antes de ejecutar una prueba"},
                3));
        questions.add(new Question("¿Cuál es el propósito principal de las pruebas de software?",
                new String[]{"Diseñar interfaces", "Detectar defectos en el programa", "Gestionar versiones del código", "Compilar el código"},
                1));
        questions.add(new Question("¿Qué se entiende por 'pruebas de integración'?",
                new String[]{"Pruebas del sistema completo", "Ensayos del funcionamiento combinando todos los módulos de la aplicación", "Pruebas de una unidad específica del código", "Pruebas de la interfaz gráfica"},
                1));
        questions.add(new Question("¿Qué son las pruebas de regresión?",
                new String[]{"Pruebas de la interfaz gráfica", "Pruebas para asegurar que nuevas modificaciones no han introducido errores", "Pruebas de una unidad específica del código", "Pruebas de caja negra"},
                1));
        questions.add(new Question("¿Qué tipo de prueba se realiza después de la integración para verificar que cumple con los requisitos establecidos?",
                new String[]{"Prueba de caja negra", "Prueba de caja blanca", "Prueba unitaria", "Prueba de validación"},
                3));
        questions.add(new Question("¿Qué herramienta se menciona para la automatización de pruebas en Java?",
                new String[]{"Ant", "Selenium", "JUnit", "Maven"},
                2));
        questions.add(new Question("¿Qué tipo de prueba se enfoca en la interfaz del módulo y la estructura de datos locales?",
                new String[]{"Prueba de unidad", "Prueba de sistema", "Prueba de regresión", "Prueba de integración"},
                0));
        questions.add(new Question("¿Qué es una postcondición en el contexto de pruebas de software?",
                new String[]{"Una herramienta de compilación", "Una condición que debe cumplirse después de ejecutar una prueba", "Un tipo de depurador", "Un método para diseño de interfaces"},
                1));
        questions.add(new Question("¿Cuál de las siguientes es una técnica para realizar pruebas de caja negra?",
                new String[]{"Prueba de condiciones límite", "Prueba de cobertura de sentencias", "Prueba del camino básico", "Análisis de valores límite"},
                3));
        questions.add(new Question("¿Qué tipo de prueba se centra en asegurar que todas las decisiones lógicas se ejecuten al menos una vez?",
                new String[]{"Prueba de caja blanca", "Prueba funcional", "Prueba de caja negra", "Prueba de regresión"},
                0));
        questions.add(new Question("¿Qué herramienta se menciona para la depuración de código en un IDE?",
                new String[]{"Editor de texto", "Constructor de interfaz gráfica", "Depurador", "Compilador"},
                2));
        questions.add(new Question("¿Cuál es el objetivo principal de la refactorización en el desarrollo de software?",
                new String[]{"Agregar nuevas funcionalidades", "Mejorar la estructura interna del código sin cambiar su comportamiento externo", "Optimizar el rendimiento del código", "Eliminar errores de sintaxis"},
                1));
        questions.add(new Question("¿Qué herramienta se utiliza para gestionar versiones de código?",
                new String[]{"JUnit", "Swing", "GIT", "Maven"},
                2));
        questions.add(new Question("¿Cuál es una de las funciones del constructor de interfaz gráfica en un IDE?",
                new String[]{"Depurar errores", "Gestionar versiones del código", "Compilar el código", "Permitir la colocación de controles usando un editor WYSIWYG"},
                3));
        questions.add(new Question("¿Qué significa el acrónimo WYSIWYG?",
                new String[]{"What You See Is What You Compile", "What You See Is What You Code", "What You See Is What You Debug", "What You See Is What You Get"},
                3));
        questions.add(new Question("¿Qué herramienta de control de versiones es mencionada en el documento?",
                new String[]{"Maven", "JUnit", "Swing", "GIT"},
                3));
        questions.add(new Question("¿Qué característica se menciona para el modelo incremental en el desarrollo de software?",
                new String[]{"Entrega el software en partes pequeñas y utilizables", "Es un modelo inflexible", "Requiere una definición completa de los requisitos al inicio", "No permite realizar cambios durante el desarrollo"},
                0));
        questions.add(new Question("¿Cuál es una desventaja mencionada del modelo en cascada?",
                new String[]{"Permite realizar cambios durante el desarrollo", "Es fácil de comprender y planificar", "Requiere muchos recursos", "Es difícil volver atrás si se cometen errores en una etapa"},
                3));
        questions.add(new Question("¿Qué modelo de desarrollo combina el modelo en cascada con el modelo iterativo de construcción de prototipos?",
                new String[]{"Modelo ágil", "Modelo en espiral", "Modelo incremental", "Modelo en cascada"},
                1));
        questions.add(new Question("¿Cuál es una ventaja del modelo en espiral?",
                new String[]{"Reduce riesgos del proyecto", "No permite realizar cambios durante el desarrollo", "Requiere una definición completa de los requisitos al inicio", "Es un modelo inflexible"},
                0));
        questions.add(new Question("¿Qué herramienta se utiliza para crear código fuente en un lenguaje de programación?",
                new String[]{"Depurador", "Constructor de interfaz gráfica", "Editor de texto", "Compilador"},
                2));
        questions.add(new Question("¿Qué componente de un IDE se encarga de traducir el código fuente a un lenguaje de bajo nivel que la máquina pueda interpretar?",
                new String[]{"Editor de texto", "Constructor de interfaz gráfica", "Compilador", "Depurador"},
                2));
        questions.add(new Question("¿Cuál de las siguientes afirmaciones describe una prueba de integración?",
                new String[]{"Pruebas de la interfaz gráfica", "Ensayos del funcionamiento combinando todos los módulos de la aplicación", "Pruebas de una unidad específica del código", "Pruebas del sistema completo"},
                1));
        questions.add(new Question("¿Qué tipo de prueba se realiza después de la integración para verificar que cumple con los requisitos establecidos?",
                new String[]{"Prueba unitaria", "Prueba de caja blanca", "Prueba de caja negra", "Prueba de validación"},
                3));
        questions.add(new Question("¿Qué es una aserción en el contexto de pruebas unitarias?",
                new String[]{"Un predicado incluido en el código para asegurar una condición", "Una herramienta de compilación", "Un tipo de depurador", "Un método para diseño de interfaces"},
                0));
        questions.add(new Question("¿Qué es una postcondición en el contexto de pruebas de software?",
                new String[]{"Una herramienta de compilación", "Un tipo de depurador", "Una condición que debe cumplirse después de ejecutar una prueba", "Un método para diseño de interfaces"},
                2));
        questions.add(new Question("¿Cuál es el objetivo principal de la refactorización en el desarrollo de software?",
                new String[]{"Optimizar el rendimiento del código", "Agregar nuevas funcionalidades", "Eliminar errores de sintaxis", "Mejorar la estructura interna del código sin cambiar su comportamiento externo"},
                3));
        questions.add(new Question("¿Cuál de las siguientes es una técnica para realizar pruebas de caja negra?",
                new String[]{"Prueba del camino básico", "Prueba de condiciones límite", "Prueba de cobertura de sentencias", "Análisis de valores límite"},
                3));
        questions.add(new Question("¿Qué tipo de prueba se enfoca en asegurar que todas las decisiones lógicas se ejecuten al menos una vez?",
                new String[]{"Prueba de caja negra", "Prueba de regresión", "Prueba funcional", "Prueba de caja blanca"},
                3));
        questions.add(new Question("¿Qué herramienta se menciona para la automatización de pruebas en Java?",
                new String[]{"JUnit", "Ant", "Maven", "Selenium"},
                0));
        questions.add(new Question("¿Qué tipo de prueba se centra en las entradas y salidas del sistema sin considerar su funcionamiento interno?",
                new String[]{"Prueba de integración", "Prueba de caja blanca", "Prueba unitaria", "Prueba de caja negra"},
                3));
        questions.add(new Question("¿Cuál es una característica del control de versiones?",
                new String[]{"Gestionar revisiones y cambios en el código", "Detectar errores de sintaxis", "Compilar el código más rápido", "Facilitar la creación de interfaces gráficas"},
                0));
        questions.add(new Question("¿Qué se necesita configurar al iniciar Eclipse por primera vez?",
                new String[]{"Sistema operativo", "Depurador", "Plugin de Swing", "Workspace"},
                3));
        questions.add(new Question("¿Qué es el JDK en el contexto del desarrollo en Java?",
                new String[]{"Java Debugging Kit", "Java Development Kit", "Java Deployment Kit", "Java Design Kit"},
                1));
        questions.add(new Question("¿Cuál de las siguientes opciones NO es un componente típico de un IDE?",
                new String[]{"Editor de texto", "Sistema operativo", "Depurador", "Compilador"},
                1));
        questions.add(new Question("¿Qué componente de un IDE permite la creación de interfaces gráficas?",
                new String[]{"Constructor de interfaz gráfica", "Compilador", "Editor de texto", "Depurador"},
                0));
        questions.add(new Question("¿Cuál es la principal función de un entorno de desarrollo integrado (IDE)?",
                new String[]{"Ejecutar el código fuente directamente", "Facilitar la programación con herramientas integradas", "Controlar la versión del hardware", "Proteger el código contra virus"},
                1));
        questions.add(new Question("¿Cuál es una técnica de prueba que no requiere conocer la estructura interna del código?",
                new String[]{"Prueba unitaria", "Prueba de integración", "Prueba de caja blanca", "Prueba de caja negra"},
                3));
        questions.add(new Question("¿Qué es una precondición en el contexto de pruebas de software?",
                new String[]{"Una herramienta de depuración", "Un error detectado durante la prueba", "Una condición que debe cumplirse antes de ejecutar una prueba", "El resultado esperado de una prueba"},
                2));
        questions.add(new Question("¿Qué se entiende por 'pruebas de integración'?",
                new String[]{"Ensayos del funcionamiento combinando todos los módulos de la aplicación", "Pruebas de una unidad específica del código", "Pruebas del sistema completo", "Pruebas de la interfaz gráfica"},
                0));
        questions.add(new Question("¿Qué tipo de prueba se realiza después de la integración para verificar que cumple con los requisitos establecidos?",
                new String[]{"Prueba de caja blanca", "Prueba unitaria", "Prueba de validación", "Prueba de caja negra"},
                2));
        questions.add(new Question("¿Qué herramienta se menciona para la automatización de pruebas en Java?",
                new String[]{"Maven", "JUnit", "Ant", "Selenium"},
                1));
        questions.add(new Question("¿Qué tipo de prueba se enfoca en la interfaz del módulo y la estructura de datos locales?",
                new String[]{"Prueba de integración", "Prueba de regresión", "Prueba de unidad", "Prueba de sistema"},
                2));
        questions.add(new Question("¿Qué herramienta se utiliza en un IDE para manejar errores de código?",
                new String[]{"Compilador", "Depurador", "Editor de texto", "Constructor de interfaz gráfica"},
                1));
        questions.add(new Question("¿Qué lenguaje de programación es el enfoque principal de Eclipse IDE?",
                new String[]{"Python", "C++", "JavaScript", "Java"},
                3));
        questions.add(new Question("¿Qué componente de un IDE se encarga de traducir el código fuente a lenguaje máquina?",
                new String[]{"Editor de texto", "Constructor de interfaz gráfica", "Depurador", "Compilador"},
                3));
        questions.add(new Question("¿Qué herramienta se menciona para la depuración de código en un IDE?",
                new String[]{"Depurador", "Compilador", "Editor de texto", "Constructor de interfaz gráfica"},
                0));
        questions.add(new Question("¿Cuál de las siguientes no es una tarea de un depurador?",
                new String[]{"Detener el programa en puntos de ruptura", "Ejecutar el programa", "Realizar pruebas unitarias", "Examinar la ejecución del programa"},
                2));
        questions.add(new Question("¿Qué es un 'plugin' en el contexto de un entorno de desarrollo?",
                new String[]{"Una aplicación independiente", "Una herramienta para diseñar interfaces", "Una extensión que agrega funcionalidad al IDE", "Un tipo de compilador"},
                2));
        questions.add(new Question("¿Cuál es la ventaja principal del uso de control de versiones?",
                new String[]{"Permitir la gestión de cambios y versiones del código", "Detectar errores en tiempo de ejecución", "Acelerar la compilación del código", "Facilitar la creación de interfaces gráficas"},
                0));

    }
}

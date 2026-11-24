package com.example.Medicamentos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MedicamentosController {

    private List<Medicamento> medicamentos = new ArrayList<>();

    public MedicamentosController() {
        medicamentos.add(new Medicamento(
                "Paracetamol",
                List.of("Dolex", "Panadol"),
                List.of("Oral", "Rectal", "Intravenosa"),
                List.of("500 mg cada 6 a 8 horas"),
                List.of("Fiebre", "Dolor leve a moderado"),
                List.of("Insuficiencia hepática grave"),
                List.of("Náuseas", "Reacciones alérgicas raras"),
                List.of("No administrar con alcohol", "Vigilar función hepática en uso prolongado")
        ));

        medicamentos.add(new Medicamento(
                "Ibuprofeno",
                List.of("Advil", "Motrin"),
                List.of("Oral"),
                List.of("400 mg cada 6 a 8 horas"),
                List.of("Fiebre", "Dolor", "Inflamación"),
                List.of("Úlcera péptica activa", "Insuficiencia renal grave"),
                List.of("Malestar estomacal", "Acidez"),
                List.of("Administrar preferiblemente con alimentos")
        ));

        medicamentos.add(new Medicamento(
                "Amoxicilina",
                List.of("Amoxil"),
                List.of("Oral"),
                List.of("500 mg cada 8 horas"),
                List.of("Fiebre", "Infecciones bacterianas"),
                List.of("Alergia a las penicilinas"),
                List.of("Diarrea", "Erupción cutánea"),
                List.of("Completar el ciclo indicado")
        ));

        medicamentos.add(new Medicamento(
                "Omeprazol",
                List.of("Losec"),
                List.of("Oral", "Intravenosa"),
                List.of("20 mg una vez al día"),
                List.of("Gastritis", "Reflujo gastroesofágico"),
                List.of("Hipersensibilidad al omeprazol"),
                List.of("Dolor de cabeza", "Estreñimiento"),
                List.of("Tomar en ayunas antes del desayuno")
        ));

        medicamentos.add(new Medicamento(
                "Loratadina",
                List.of("Clarityne"),
                List.of("Oral"),
                List.of("10 mg una vez al día"),
                List.of("Alergia", "Rinitis"),
                List.of("Hipersensibilidad al principio activo"),
                List.of("Somnolencia leve", "Sequedad bucal"),
                List.of("Observar respuesta alérgica del paciente")
        ));
    }

    @GetMapping("/")
    public String prueba() {
        return "Hola mundo";
    }

    @GetMapping("/medicamentos")
    public List<Medicamento> listarMedicamentos() {
        return medicamentos;
    }

    @GetMapping("/sintoma")
    public List<Medicamento> buscarPorSintoma(@RequestParam String sintoma) {
        List<Medicamento> medicamentosConSintoma = new ArrayList<>();
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getIndicaciones().contains(sintoma)) {
                medicamentosConSintoma.add(medicamento);
            }
        }
        return medicamentosConSintoma;
    }
}
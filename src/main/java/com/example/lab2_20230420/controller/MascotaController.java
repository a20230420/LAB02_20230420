package com.example.lab2_20230420.controller;


import com.example.lab2_20230420.dto.MascotaForm;
import com.example.lab2_20230420.entity.Mascota;
import com.example.lab2_20230420.repository.MascotaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mascota")
public class MascotaController {

    private final MascotaRepository mascotaRepository;

    public MascotaController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;;
    }

    @GetMapping("")
    public String lista(Model model) {
        model.addAttribute("mascotas", mascotaRepository.findAll());;
        return "list";

    }
    @GetMapping("/edit")
    public String edit(@RequestParam Integer id, Model model) {
        Mascota mascota = mascotaRepository.findById(id).orElse(null);
        if (mascota == null) return "redirect:/list";

        MascotaForm form = new MascotaForm();
        form.setId(mascota.getId());
        form.setNombre(mascota.getNombre());
        form.setEspecie(mascota.getEspecie());
        form.setRaza(mascota.getRaza());
        form.setEdad(mascota.getEdad());
        form.setNombreDueno(mascota.getNombreDueno());
        form.setTelefono(mascota.getTelefono());
        form.setEstado(mascota.getEstado());


        model.addAttribute("mascotaForm", form);
        model.addAttribute("mascotas", mascotaRepository.findAll());
        model.addAttribute("mode", "edit");
        return "form";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute MascotaForm form, Model model) {

        Mascota mascota = mascotaRepository.findById(form.getId()).orElse(null);
        if (mascota == null) return "redirect:/mascota/list";

        mascota.setNombre(form.getNombre());
        mascota.setEspecie(form.getEspecie());
        mascota.setRaza(form.getRaza());
        mascota.setEdad(form.getEdad());
        mascota.setNombreDueno(form.getNombreDueno());
        mascota.setTelefono(form.getTelefono());
        mascota.setEstado(form.getEstado());

        mascotaRepository.save(mascota);
        return "redirect:/mascota/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
        if (mascotaRepository.existsById(id)) {
            mascotaRepository.deleteById(id);
        }
        return "list";
    }
}

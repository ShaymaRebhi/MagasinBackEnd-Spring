package tn.esprit.spring.service;


import tn.esprit.spring.entities.Rayon;

import java.util.List;

public interface RayonService {
    public void addRayon(Rayon rayon);
    public Rayon getRayonById(long id);

    public List<Rayon> getAllRayon();
    public void DeleteRayon(long id);
    public void DeleteAllRayon();
    public void UpdateRayon(Rayon rayon, long id);
    void assignProduitToRayon(Long idProduit, Long idRayon);
    String retreiveRayonStatus();
}

package tn.iit.storemanagement.mappers;

import tn.iit.storemanagement.domain.Medicament;
import tn.iit.storemanagement.dto.CategoryDto;
import tn.iit.storemanagement.dto.MedicamentDto;

public class MedicamentMapper {
    public static MedicamentDto medicamentToMedicamentDto(Medicament medicament)
    {
        MedicamentDto medicamentDto = new MedicamentDto ();
        medicamentDto.setId (medicament.getId ());
        medicamentDto.setDosage (medicament.getDosage ());
        medicamentDto.setCategoryName (medicament.getCategory ().getName ());
        medicamentDto.setCategoryId (medicament.getCategory ().getId ());
        medicamentDto.setExpiredDate (medicament.getExpiredDate ());
        medicamentDto.setPrice (medicament.getPrice ());
        medicamentDto.setName (medicament.getName ());
        return medicamentDto;
    }
    public static Medicament medicamentDtoToMedicament(MedicamentDto medicamentDto)
    {
        Medicament medicament = new Medicament ();
        medicament.setId (medicamentDto.getId ());
        medicament.setDosage (medicamentDto.getDosage ());
        CategoryDto categoryDto=new CategoryDto (medicamentDto.getCategoryId (),medicamentDto.getCategoryName ());
        medicament.setCategory (CategoryMapper.categoryDtoToCategory (categoryDto));
        medicament.setExpiredDate (medicamentDto.getExpiredDate ());
        medicament.setPrice (medicamentDto.getPrice ());
        medicament.setName (medicamentDto.getName ());
        return medicament;
    }
}

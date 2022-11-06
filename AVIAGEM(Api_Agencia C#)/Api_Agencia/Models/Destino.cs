using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
namespace Api_Agencia.Models
{
    [Table("Destino")]
    public class Destino
    {
        [Key]
        public int DestinoId { get; set; }
        [Required(ErrorMessage = "Informe o Destino")]
            [StringLength(100)]
            public string Local { get; set; }
        [Required(ErrorMessage = "Informe a data")]
        public string Data_ida { get; set; }
        [Required(ErrorMessage = "Informe o Valor")]

        public double valor_diaria { get; set; }


    }
}

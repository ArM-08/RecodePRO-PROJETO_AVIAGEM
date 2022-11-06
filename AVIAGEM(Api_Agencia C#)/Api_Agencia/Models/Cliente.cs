using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
namespace Api_Agencia.Models
{
    [Table("Cliente")]
    public class Cliente
    {
        [Key]
        public int ClienteID { get; set; }
        [Required(ErrorMessage = "Informe o ID")]
            [StringLength(100)]
            public string Email { get; set; }
        [Required(ErrorMessage = "Informe a Email")]
        public string Nome { get; set; }
        [Required(ErrorMessage = "Informe o Nome")]

        public double Senha { get; set; }


    }
}

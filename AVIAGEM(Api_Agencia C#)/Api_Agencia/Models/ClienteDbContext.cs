using Microsoft.EntityFrameworkCore;

namespace Api_Agencia.Models
{
    public class ClienteDbContext : DbContext
    {
        public ClienteDbContext(DbContextOptions<ClienteDbContext> options)
            : base(options) 
        { }
         public DbSet<Cliente> Clientes { get; set; }    
    }
}

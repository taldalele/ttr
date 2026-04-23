// Função para simular o agendamento
function agendar() {
    const mensagem = "Olá! Gostaria de agendar um horário na barbearia.";
    const numeroWhatsapp = "5511999999999"; // Substitua pelo seu número
    
    // Alerta simples para o usuário
    alert("Redirecionando para o nosso WhatsApp de reservas...");
    
    // Abre o WhatsApp com a mensagem pré-definida
    window.open(`https://wa.me/${numeroWhatsapp}?text=${encodeURIComponent(mensagem)}`, '_blank');
}

// Efeito de scroll suave para os links do menu
document.querySelectorAll('nav a').forEach(anchor => {
    anchor.addEventListener('click', function(e) {
        e.preventDefault();
        const section = document.querySelector(this.getAttribute('href'));
        section.scrollIntoView({ behavior: 'smooth' });
    });
});
// Efeito de Revelação (Scroll Reveal)
const observerOptions = {
    threshold: 0.2
};

const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.style.opacity = "1";
            entry.target.style.transform = "translateY(0)";
        }
    });
}, observerOptions);

// Aplica a animação inicial nos itens da galeria
document.querySelectorAll('.galeria-item').forEach(item => {
    item.style.opacity = "0";
    item.style.transform = "translateY(30px)";
    item.style.transition = "all 0.6s ease-out";
    observer.observe(item);
});
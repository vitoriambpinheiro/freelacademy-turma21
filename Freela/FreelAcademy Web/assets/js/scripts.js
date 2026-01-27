/* ARQUIVO: assets/js/scripts.js */

document.addEventListener('DOMContentLoaded', () => {
    
    // --- 1. MENU MOBILE (HOME) ---
    const mobileToggle = document.querySelector('.mobile-toggle');
    const navLinks = document.querySelector('.nav-links');
    if (mobileToggle && navLinks) {
        mobileToggle.addEventListener('click', () => {
            if (navLinks.style.display === 'flex') {
                navLinks.style.display = 'none';
            } else {
                navLinks.style.display = 'flex';
                navLinks.style.position = 'absolute';
                navLinks.style.top = '100%'; navLinks.style.left = '0'; navLinks.style.width = '100%';
                navLinks.style.background = '#ffffff'; navLinks.style.flexDirection = 'column';
                navLinks.style.padding = '20px'; navLinks.style.borderTop = '1px solid #eee';
                navLinks.style.boxShadow = '0 5px 15px rgba(0,0,0,0.1)';
            }
        });
    }

    // --- 2. SIDEBAR DO PAINEL (TOGGLE) ---
    const sidebarToggle = document.getElementById('toggleSidebar');
    const sidebar = document.getElementById('sidebar');
    const mainContent = document.getElementById('mainContent');
    
    if (sidebarToggle && sidebar && mainContent) {
        sidebarToggle.addEventListener('click', () => {
            sidebar.classList.toggle('collapsed');
            mainContent.classList.toggle('expanded');
        });
    }

    // --- 3. CHAT LIST (TOGGLE) - NOVO! ---
    const chatToggle = document.getElementById('toggleChatList');
    const chatList = document.querySelector('.chat-sidebar-list');

    if (chatToggle && chatList) {
        chatToggle.addEventListener('click', () => {
            chatList.classList.toggle('collapsed');
            // Troca o ícone da seta (opcional, visual)
            const icon = chatToggle.querySelector('i');
            if (chatList.classList.contains('collapsed')) {
                icon.classList.remove('fa-chevron-left');
                icon.classList.add('fa-chevron-right');
            } else {
                icon.classList.remove('fa-chevron-right');
                icon.classList.add('fa-chevron-left');
            }
        });
    }
});
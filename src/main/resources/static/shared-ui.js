window.MedProUI = (function () {
    function openModal(id) {
        const overlay = document.getElementById(id);
        if (!overlay) return;
        overlay.classList.add("open");
    }

    function closeModal(id) {
        const overlay = document.getElementById(id);
        if (!overlay) return;
        overlay.classList.remove("open");
    }

    function wireOverlayClose(id) {
        const overlay = document.getElementById(id);
        if (!overlay) return;
        overlay.addEventListener("click", function (event) {
            if (event.target === overlay) {
                closeModal(id);
            }
        });
    }

    function ensureToastStack() {
        let stack = document.getElementById("toastStack");
        if (!stack) {
            stack = document.createElement("div");
            stack.id = "toastStack";
            stack.className = "toast-stack";
            document.body.appendChild(stack);
        }
        return stack;
    }

    function showToast(message, type = "success") {
        const stack = ensureToastStack();
        const toast = document.createElement("div");
        toast.className = `toast-item ${type}`;
        toast.textContent = message;
        stack.appendChild(toast);

        requestAnimationFrame(function () {
            toast.classList.add("show");
        });

        setTimeout(function () {
            toast.classList.remove("show");
            setTimeout(function () {
                toast.remove();
            }, 180);
        }, 2600);
    }

    function sanitize(text) {
        return String(text ?? "")
            .replace(/&/g, "&amp;")
            .replace(/</g, "&lt;")
            .replace(/>/g, "&gt;")
            .replace(/"/g, "&quot;")
            .replace(/'/g, "&#39;");
    }

    return {
        openModal,
        closeModal,
        wireOverlayClose,
        showToast,
        sanitize
    };
})();

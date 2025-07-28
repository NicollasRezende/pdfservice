/**
 * @module paragraph-spacing/index
 */
import { Plugin } from 'ckeditor5';

import { ParagraphSpacingEditing } from './editing.js';
import { ParagraphSpacingUI } from './ui.js';

const ATTRIBUTE = 'paragraphSpacing';

class ParagraphSpacing extends Plugin {
	/**
	 * @inheritDoc
	 */
	static get requires() {
		return [ParagraphSpacingEditing, ParagraphSpacingUI];
	}

	/**
	 * @inheritDoc
	 */
	static get pluginName() {
		return 'ParagraphSpacing';
	}
}

export { ATTRIBUTE, ParagraphSpacingUI, ParagraphSpacingEditing, ParagraphSpacing };
